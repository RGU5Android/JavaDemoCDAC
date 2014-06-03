package in.rahul.ReflectionDemo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainReflection {
	public static void main(String[] args) {

		Person person = new Person();

		Class<Person> personClass = (Class<Person>) person.getClass();

		System.out.println("Name : " + personClass.getName());
		System.out.println("Simple Name : " + personClass.getSimpleName());

		System.out
				.println("*********************************************METHODS IN PERSON CLASS*********************************************");
		Method[] methods = personClass.getMethods();
		for (Method m : methods) {
			System.out.println("Method Name : " + m);
		}

		System.out
				.println("*********************************************MODIFIERS*********************************************");
		int modifiers = personClass.getModifiers();
		System.out.println("isAbstract : " + Modifier.isAbstract(modifiers));
		System.out.println("isPublic : " + Modifier.isPublic(modifiers));
		System.out.println("isFinal : " + Modifier.isFinal(modifiers));

		System.out
				.println("*********************************************PARAMETERS IN METHOD*********************************************");

		for (Method mpara : methods) {
			Class mparameters[] = mpara.getParameterTypes();
			for (Class para : mparameters) {
				System.out.println("Parameter Type : " + para.getName());
			}
		}

	}

}
