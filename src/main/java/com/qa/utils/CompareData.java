package com.qa.utils;

import java.util.List;

public class CompareData 
{	
	public static boolean isEqualIgnoringOrder(List<String> x, List<String> y) 
	{
        return x.equals(y);
    }
}
