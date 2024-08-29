/*
 * @ (#) HinhChuNhat.java 		1.0	8/29/2024
 *
 * Copyright (c) 2024 IUH.  All rights reserved.
 */


package iuh.fit.ds;


/*
 * @description:
 * @outhor: Huu Trong
 * @date:	8/29/2024
 * @version:	1.0
 */
public class HinhChuNhat {

        private double chieuDai;
        private double chieuRong;

        public HinhChuNhat(double chieuDai, double chieuRong) {
            if (chieuDai < 0 || chieuRong < 0) {
                throw new RuntimeException("Chiều dài và chiều rộng phải lớn hơn 0");
            }
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }

        public HinhChuNhat() {
            this(1.0, 1.0);
        }

        // Phương thức getter
        public double layChieuDai() {
            return chieuDai;
        }

        public double layChieuRong() {
            return chieuRong;
        }

        public double tinhDienTich() {
            return chieuDai * chieuRong;
        }

        public double tinhChuVi() {
            return 2 * (chieuDai + chieuRong);
        }

        @Override
        public String toString() {
            return "Hình chữ nhật [chiều dài = " + chieuDai + ", chiều rộng = " + chieuRong + "]";
        }
    }


