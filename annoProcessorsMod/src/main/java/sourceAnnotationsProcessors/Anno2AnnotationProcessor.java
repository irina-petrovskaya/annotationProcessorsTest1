package sourceAnnotationsProcessors;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/22/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
@SupportedAnnotationTypes("myAnnotations.PrintMe")
public class Anno2AnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();
        for (TypeElement te : annotations) {
            for (Element e : roundEnv.getElementsAnnotatedWith(te)) {
                String s = "*****";
                String _extraOption = processingEnv.getOptions().get("extraOption");
                if(!(_extraOption.equals(null))) {
                    s += _extraOption;
                }
                String _msg = s + e.toString();
                messager.printMessage(Diagnostic.Kind.NOTE,
                        _msg);
                writeToFile(_msg, e.toString()+".txt");
            }}

        return true;
    }

    private void writeToFile(String resultArg, String resultsArg) {
        try {
            FileObject sourceFile = processingEnv.getFiler().createResource(StandardLocation.SOURCE_OUTPUT, "results", resultsArg);
            PrintWriter out = new PrintWriter(sourceFile.openWriter());
            out.println(resultArg);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }


}

