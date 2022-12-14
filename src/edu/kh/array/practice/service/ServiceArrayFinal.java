package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class ServiceArrayFinal {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void ArrayPracticeFinal1() {
		
		int arr[] = new int[9];
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || i % 2 == 0) {
				sum += arr[i];
			}
		}System.out.print("짝수 번째 인덱스 합 : " + sum);
	}
	
	
	public void ArrayPracticeFinal2() {
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(i != 0 && i % 2 != 0) {
				sum += arr[i];
			}
		}System.out.print("홀수 번쨰 인덱스 합은 : " + sum);
		
	}
	
	
	
	public void ArrayPracticeFinal3() {
		
		
		System.out.print("양의 정수: ");
		int input = sc.nextInt();

		int arr[] = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]);
		}
		
	}
	
	
	public void ArrayPracticeFinal4() {
		
		// 정수 5개 입력 받기 및 초기화
		// 검색할 정수 하나 입력 받기
		// 배열에 같은 수가 있는 인덱스 출력
		// 배열에 없으면 존재안함 출력
		
		int arr[] = new int[5];
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + ": ");
			int num = sc.nextInt();
			arr[i] = num;
		}// System.out.println(Arrays.toString(arr)); 확인 완료
		
		System.out.print("검색할 값 : ");
		int wantToFind = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == wantToFind) {
				System.out.print("인덱스 " + i );
				flag = false;
				break;
			}
		}if(flag) {
			System.out.println("없음");
		}
	}
	
	
	public void ArrayPracticeFinal5() {

		// 문자열 입력 받고 문자 만큼의 배열 할당하기
		// 할당한 배열에 문자 넣기
		
		
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		
		//System.out.print(word.length()); // 입력 받은 값 문자열 길이 확인 
		
		char arr[] = new char[word.length()];
		int count = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
		}
		System.out.println(Arrays.toString(arr)); //배열이 잘 들어갔는지 확인  
		
		System.out.print("찾고 싶은 문자 입력 : ");
		
		char wantToFind = sc.next().charAt(0);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == wantToFind) {
				System.out.printf("%s에 %c가 존재하는 위치 : %d\n" ,word,wantToFind,i, i);
				count++;
			}
		}System.out.print(wantToFind + "개수 : " + count); // 왜 여기서 count가 쌓인 값이 나오는가?? 질문하기  
	}
	
	
	public void ArrayPracticeFinal6() {
		
		
		// 사용자가 배열 길이 직접 입력 ㅅㅋㄴ
		// 그 정수형 값 만큼 배열 선언 및 할당
		// 배열 크기만큼 사용자가 직접 값을 입력해서 각각의 인덱스에 초기화
		
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		int sum = 0;
		
		
		// System.out.println(Arrays.toString(arr)); 확인
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 넣을 값 : ");
			int input2 = sc.nextInt();
			arr[i] = input2;
			sum += arr[i]; // sum = sum + arr[i];
		}//System.out.println(Arrays.toString(arr)); 확인 완료
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("\n총 합: %d ", sum);
	}
	
	public void ArrayPracticeFinal7() {
		
		// 주민 번호 입력 받기
		
		System.out.print("주민등록번호(-포함) : ");
		String idnum = sc.next();
		
		char idnum2[] = new char[idnum.length()];
		
		// System.out.println(Arrays.toString(idnum2)); 확인 완료
		
		for(int i = 0; i < idnum2.length; i++) {
			idnum2[i] = idnum.charAt(i);
			if(i < 8) {
				System.out.print(idnum2[i]);
			}
			else {
				System.out.print("*");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public void practicecece2() {
		System.out.print("asasdasdadasd");
		
	}
}
	
	
