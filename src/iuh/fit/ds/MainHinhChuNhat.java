/*
 * @ (#) MainHinhChuNhat.java 		1.0	8/29/2024
 *
 * Copyright (c) 2024 IUH.  All rights reserved.
 */


package iuh.fit.ds;

import java.util.Scanner;

/*
 * @description:
 * @outhor: Huu Trong
 * @date:	8/29/2024
 * @version:	1.0
 */
public class MainHinhChuNhat {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập chiều dài: ");
            double chieuDai = scanner.nextDouble();

            System.out.print("Nhập chiều rộng: ");
            double chieuRong = scanner.nextDouble();

            HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);

            System.out.println("Chu vi hình chữ nhật: " + hcn.tinhChuVi());
            System.out.println("Diện tích hình chữ nhật: " + hcn.tinhDienTich());
            System.out.println(hcn.toString());

            scanner.close();
        }
    }


