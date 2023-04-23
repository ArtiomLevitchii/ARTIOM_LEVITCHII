package org.example.homework_nr_6;



    public class Date {
        private int date;
        private int month;
        private int year;

        public Date(int date, int month, int year) {
            if (month > 0 && month < 13) {
                this.month = month;
            } else {
                System.out.println("Wrong month! Choose from 1 to 12");
            }
            if (year > 0) {
                this.year = year;
            } else {
                System.out.println("Choose a year B.C.");
            }
            switch (this.month) {
                case 1, 3, 5, 7,8,10,12:
                    if (date > 0 && date < 32) {
                        this.date = date;
                    }else{
                        System.out.println("This month: "+this.month+" has max 31 day.Choose another day");
                    } ;
                    break;
                case 4,6,9,11 :
                    if (date > 0 && date < 31) {
                        this.date = date;
                    }else{
                        System.out.println("This month: "+this.month+" has max 30 days. Choose another day");
                    } ;
                    break;
                case 2:
                    if((this.year%4==0)&&(date>0&&date<30)){
                        this.date=date;
                    }else if((this.year%4!=0)&&(date>0&&date<29)){
                        this.date=date;
                    }else{
                        System.out.println("Choose another day");
                    }
            }

        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            switch (this.month) {
                case 1, 3, 5, 7,8,10,12:
                    if (date > 0 && date < 32) {
                        this.date = date;
                    }else{
                        System.out.println("This month: "+this.month+" has max 31 day.Choose another day");
                    } ;
                    break;
                case 4,6,9,11 :
                    if (date > 0 && date < 31) {
                        this.date = date;
                    }else{
                        System.out.println("This month: "+this.month+" has max 30 days. Choose another day");
                    } ;
                    break;
                case 2:
                    if((this.year%4==0)&&(date>0&&date<30)){
                        this.date=date;
                    }else if((this.year%4!=0)&&(date>0&&date<29)){
                        this.date=date;
                    }else{
                        System.out.println("Choose another day");
                    }
            }
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            if (month > 0 && month < 13) {
                this.month = month;
            } else {
                System.out.println("Wrong month! Choose from 1 to 12");
            }

        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year > 0) {
                this.year = year;
            } else {
                System.out.println("Choose a year B.C.");
            }

        }

        public void displayDate(){
            System.out.println("Your date: "+this.date+"/"+this.month+"/"+this.year);
        }
    }
    
