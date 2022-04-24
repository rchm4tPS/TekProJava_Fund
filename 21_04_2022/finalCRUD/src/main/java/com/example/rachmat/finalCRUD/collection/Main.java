package com.example.rachmat.finalCRUD.collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Main {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		BufferedReader br = null;
		
		showLayoutTable();
		
		try {
			br = new BufferedReader(new FileReader("apicrud.json"));
			List<Result> results1 = new ArrayList<Result>();
			
			Result[] results = gson.fromJson(br, Result[].class);
			
			if (results != null) {
				for (Result result : results) {
					results1.add(result);
					System.out.printf("  %02d \t %-30s    %-33s  %-30s\n", 
							result.getId(), result.getName(),
							result.getTempat_lahir(), result.getMakanan_favorit());
				}
			}
			
			
			System.out.println("\nElements of name after added to ArrayList : ");
			for (int i = 0; i < results1.size(); i++) {
				System.out.println("  >>> " + results1.get(i).getName());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private static void showLayoutTable() {
		System.out.println("No.ID  |    Nama Lengkap Mahasiswa     |   Tempat Kelahiran Mahasiswa    |    Makanan Kesukaan    |");
		System.out.println("====================================================================================================");
	}

}
