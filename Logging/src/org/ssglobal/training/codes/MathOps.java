package org.ssglobal.training.codes;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MathOps {
	// steps in making a logger
		// 1-> create or build the private logger object
		
		private Logger logger = Logger.getLogger(MathOps.class.getName());
		
		public MathOps() {
			// 2-> set the logger level
			logger.setLevel(Level.INFO);
			
			// 3-> create a fileHandler
			try {
				FileHandler fileHandler = new FileHandler("./src/Config/logfile/math.log", true);
				fileHandler.setLevel(Level.CONFIG); // inherits current logger level if you don't set it here
				fileHandler.setEncoding("UTF-8");
				
				// 4-> create format
				SimpleFormatter txtFormatter = new SimpleFormatter();
				fileHandler.setFormatter(txtFormatter);
				logger.addHandler(fileHandler);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public MathOps(int x, int y) {
			logger.setLevel(Level.OFF);
			
			try {
				FileHandler fileHandler = new FileHandler("./src/Config/logfile/math.log", true);
				fileHandler.setLevel(Level.CONFIG); // inherits current logger level if you don't set it here
				fileHandler.setEncoding("UTF-8");
				logger.addHandler(fileHandler);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public int add(int x, int y) {
			logger.info("start of method divide() with parameters: x=%d y=%d".formatted(x, y));
			
			logger.warning("using custom Date() object. DEPCRECATED");
			Date xmas = new Date(123, 1, 32);
			System.out.println(xmas);
			
			int sum = x + y;
			logger.info("end of method divide() with parameters: x=%d y=%d".formatted(x, y));
			return sum;
		}
		
		public int divide(int x, int y) throws ArithmeticException, Exception {
			logger.info("start of method divide() with parameters: x=%d y=%d".formatted(x, y));
			if (y == 0) {
				//
				logger.severe("division by zero error");
				throw new ArithmeticException();
			}
			
			//
			logger.info("end of method divide() with parameters: x=%d y=%d".formatted(x, y));
			return x / y;
		}
		
		public int[] displayArray(int... arrData) {
			logger.info("start of method displayArray() with parameter: arrData=%s".formatted(Arrays.toString(arrData)));
			try {
				int len = arrData.length;
				System.out.println("length of array: %d".formatted(len));
				System.out.println(Arrays.toString(arrData));
			} catch (NullPointerException e) {
				logger.severe(e.getMessage());
			}
			logger.info("end of method displayArray() with parameter: arrData=%s".formatted(Arrays.toString(arrData)));
			return arrData;
		}
}
