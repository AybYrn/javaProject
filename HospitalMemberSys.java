/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lg13q2;

/**
 *
 * @author Lenovo
 */
public class HospitalMemberSys {

    public static int MAX_SIZE = 5;
    public static HospitalMember[] hm = new HospitalMember[MAX_SIZE];
    public static int count = 0;

    public static boolean checkId(int id) {
        for (int i = 0; i < count; i++) {
            if (hm[i].findId(id)) {
                return false;
            }
        }
        return true;
    }

    public static boolean addHospitalMember(int id, String nameSurname, String dept, String medSchool) {
        if (count < MAX_SIZE & checkId(id)) {
            hm[count] = new Doctor(id, nameSurname, dept,medSchool);
            count++;
            return true;
        }
        return false;
    }

    public static HospitalMember search(int n) {
        for (int i = 0; i < count; i++) {
            if (hm[i].getId() == n) {
                return hm[i];
            }
        }
        return null;
    }

    public static String display() {
        String st = "";
        for (int i = 0; i < count; i++) {
            st += ((Doctor)hm[i]).toString() + "\n";
        }
        return st;
    }

}
