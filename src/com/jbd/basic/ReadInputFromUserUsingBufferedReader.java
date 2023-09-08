package com.jbd.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromUserUsingBufferedReader {

	public static void main(String[] args) {

		String data = "";
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			data = bufferedReader.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Entered data is : " + data);
	}
}
