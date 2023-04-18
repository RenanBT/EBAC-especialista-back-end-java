public class ReflectionsApp {

    public static void main(String[] args) {
        AnnotationsClass obj = new AnnotationsClass();

        AnnotationClass annotation = AnnotationsClass.class.getAnnotation(AnnotationClass.class);
        String annotationValue = annotation.value();
        System.out.println(annotationValue);
    }
}
