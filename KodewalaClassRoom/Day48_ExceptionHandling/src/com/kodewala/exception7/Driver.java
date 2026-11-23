package com.kodewala.exception7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver
{

	public static void main(String[] args) throws SQLException
	{
		String fileName = "text.xls";

		// auto closable
		try (

				FileOutputStream fis = new FileOutputStream(new File(fileName));
				Connection con = DriverManager.getConnection("")

		) // try with resources
		{

			// 100 lines biz logic
			String name = "dsg";
			name.charAt(0); // NPE

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		// fis will be closed automatically

	}

}