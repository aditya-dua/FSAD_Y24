package spring_intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring-config-collections.xml");
		
		DICollections coll =(DICollections)context.getBean("DIColl");
		
		System.out.println(coll.getNameList());
		System.out.println(coll.getCountrySet());
		System.out.println(coll.getAddressMap());
	}

}
