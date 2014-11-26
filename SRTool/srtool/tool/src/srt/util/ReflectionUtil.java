package srt.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
	
	@SuppressWarnings("rawtypes")
	public static Class getNextSubclassDown(Object o, Class superclass)
	{
		Class next = o.getClass();
		do
		{
			if(next.getSuperclass().equals(superclass))
			{
				return next;
			}
			next = next.getSuperclass();
		} while(next != null);
		
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public static Object callMethod(String name, Object instance, Class[] argTypes, Object[] args)
	{
		try {
			Method method = instance.getClass().getMethod(name, argTypes);
			method.setAccessible(true);
			return method.invoke(instance, args);
		} catch (InvocationTargetException e) {
			if(e.getCause() instanceof RuntimeException) {
				throw (RuntimeException) e.getCause(); 
			}
			throw new RuntimeException(e.getCause());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
