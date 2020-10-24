package objectFactory;

import java.lang.reflect.Constructor;

import org.testng.IObjectFactory;
import org.testng.IObjectFactory2;

public class ObjectFactory implements IObjectFactory2{

	/*
	 * public Object newInstance(Class<?> cls) { // TODO Auto-generated method stub
	 * return null; }
	 */
	
	  
	  
	  public Object newInstance(Class<?> cls) {
	  // TODO Auto-generated method stub
	  try { 
		  return cls.newInstance(); 
		  } 
	  catch(InstantiationException |IllegalAccessException e) 
	  { System.out.println("yesyesyesyesyesy");
	  
	  e.printStackTrace(); }
	  
	  return null; }
	 

}