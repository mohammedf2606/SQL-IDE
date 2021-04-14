/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONLines
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.FinalJSONLine
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialJSONLinesImpl
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StartValueImpl
import java.util.ArrayList
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.NormalValue
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StringDeclarationImpl
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.DeclaredVariableImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TraceryLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as TraceryProgram
		fsa.generateFile(getFileName(model, resource), model.generate)
	}
	
	def getFileName(TraceryProgram program, Resource resource) {
		resource.URI.appendFileExtension('txt').lastSegment
	}
	
	def generate(TraceryProgram program) {
		val statements = program.statements.head.eContents	
	'''
		{
		«FOR statement : statements»
			«val listOfParts = new ArrayList()»
			«IF statement.class == InitialJSONLinesImpl»
				«val JSONLine = statement as InitialJSONLines»
				«val value = JSONLine.value as StartValueImpl»
				«val innerStatement = value.valueInnerStatements»
				«FOR parts : innerStatement»
					«IF parts.class == StringDeclarationImpl»
						«val string = parts as StringDeclarationImpl»
						«val done = listOfParts.add('"' + string.value + '"')»
					«ELSE»
						«val variableDeclaration = parts as DeclaredVariableImpl»
						«val variable = variableDeclaration.variable as InitialJSONLines»
						«val done = listOfParts.add(' "#' + variable.name + '#"')»
					«ENDIF»
				«ENDFOR»
				«val outerStatement = value.vals»
				«FOR NormalValue normalVal : outerStatement»
					«val innerNormal = normalVal.valueInnerStatements»
					«FOR parts : innerNormal»
						«IF parts.class == StringDeclarationImpl»
							«val string = parts as StringDeclarationImpl»
							«val done = listOfParts.add('"' + string.value + '"')»
						«ELSE»	
							«val variableDeclaration = parts as DeclaredVariableImpl»
							«val variable = variableDeclaration.variable as InitialJSONLines»
							«val done = listOfParts.add(' "#' + variable.name + '#"')»
						«ENDIF»
					«ENDFOR»
				«ENDFOR»		
				«'\t' + '"' + JSONLine.getName() + '"' + ": [" + listOfParts.join(",") + "],"»
			«ELSE»
				«val JSONLine = statement as FinalJSONLine»
				«val value = JSONLine.value as StartValueImpl»
				«val innerStatement = value.valueInnerStatements»
				«FOR parts : innerStatement»
					«IF parts.class == StringDeclarationImpl»
						«val string = parts as StringDeclarationImpl»
						«val done = listOfParts.add('"' + string.value + '"')»
					«ELSE»	
						«val variableDeclaration = parts as DeclaredVariableImpl»
						«val variable = variableDeclaration.variable as InitialJSONLines»
						«val done = listOfParts.add(' "#' + variable.name + '#"')»
					«ENDIF»
				«ENDFOR»
				«val outerStatement = value.vals»
				«FOR NormalValue normalVal : outerStatement»
					«val innerNormal = normalVal.valueInnerStatements»
					«FOR parts : innerNormal»
						«IF parts.class == StringDeclarationImpl»
							«val string = parts as StringDeclarationImpl»
							«val done = listOfParts.add('"' + string.value + '"')»
						«ELSE»	
							«val variableDeclaration = parts as DeclaredVariableImpl»
							«val variable = variableDeclaration.variable as InitialJSONLines»
							«val done = listOfParts.add(' "#' + variable.name + '#"')»
						«ENDIF»
					«ENDFOR»
				«ENDFOR»
				«'\t' + '"' + "origin" + '"' + ": [" + listOfParts.join(",")  + "]"»
			«ENDIF»
		«ENDFOR»
		}
	'''
	}
}
