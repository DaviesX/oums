package com.oums.junit.util;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import com.oums.util.OrderUtil;
import com.oums.util.TimeUtil;

public class TestTimeUtil {

	@Test
	public void testDayOfWeek() {
		System.out.println(TimeUtil.dayOfWeek());
	}

	@Test
	public void testNowTime() {
		
		System.out.println(TimeUtil.getNowTime());
		
	}
	
}
