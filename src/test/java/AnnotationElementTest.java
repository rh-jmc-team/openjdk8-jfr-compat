import jdk.jfr.Event;
import jdk.jfr.AnnotationElement;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.EventFactory;
import jdk.jfr.Description;
import jdk.jfr.Name;
import jdk.jfr.Label;

import java.util.List;
import java.util.ArrayList;

public class AnnotationElementTest{
	public static void main (String args[]) {
		List<AnnotationElement> typeAnnotations = new ArrayList<>();
		typeAnnotations.add(new AnnotationElement(Name.class, "com.example.HelloWorld"));
		typeAnnotations.add(new AnnotationElement(Label.class, "Hello World"));
		typeAnnotations.add(new AnnotationElement(Description.class, "Helps programmer getting started"));

		List<AnnotationElement> fieldAnnotations = new ArrayList<>();
		fieldAnnotations.add(new AnnotationElement(Label.class, "Message"));

		List<ValueDescriptor> fields = new ArrayList<>();
		fields.add(new ValueDescriptor(String.class, "message", fieldAnnotations));

		EventFactory f = EventFactory.create(typeAnnotations, fields);
		Event event = f.newEvent();
		event.commit();
	}
}
