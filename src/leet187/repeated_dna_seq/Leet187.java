package leet187.repeated_dna_seq;

import java.util.*;

/**
 * Created by Administrator on 2016/4/21.
 */
public class Leet187 {

    public static void main(String[] args) {
        Leet187 l = new Leet187();
//        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        long start = System.currentTimeMillis();
        String s = "CCTATTTAAGGGAATCGCGGTCAACTATGTTGCCAGAATATAGGATGGAAAGCAGACTCGCCGGCAGACGCTCTGAGATTCTCTGTAATCGATCTGAGTTCATAAGCGACTCATAGACACCGTAGGCCATGACGGGGGAGGTGCGGGTAGTCGCAAAAAAAATGTGGCCTGCGTTCCGAAAGTTAATCGTAAGGACCTCTTAAGGTCAATTTCCGTAGTGATATAACGGACGCGACTTTAGGATACTATATTGCCCCACATTAACTCCCTTCCCTCTGCAATCGGCATGTGCTCCCGAGGTATACTGTCTTCGGAACAAACTGAATCCATACACCTCTTATCGACCCAGCACCTCCGAAAAGGAAATCGACGCCCCAACATTATACGCCTAGACAATTGCAACATAGAGCGAGACGTAGCGATCCAAACGAGCTAACAGCTCGAGATAACGAGTGCCTACGGCGATCGATGTCAAACGTCCAAGTGCATACTCGCTAGGACATTGGCTCATCAGGACTCAACTTAGTAGCTGATGCTGCTAGTTTAACGTCTTGTAATCAATATAGAGCATTGCACGGACACCAGCGCTCAACCTGGAGATGCCTTGTCTCGGAAAAACTGCATTCTGTAATAACCACGGGGTGCCACATTCCGGAACCGGGATCCGTCAAGCATGCCTTTCCGATTCATCGCGGGGTACCTCTGGCTTCCTTGAACCTGGGTGGGTATAAAATAACCGGTTTTAAGTGGCTCGACAGAGCGGGAAGCAGGCGCTATCATCAGGTTTTTACGGATTTATAGAGACCTCTTGTGCAGCAATACCTCTTTAATCCAATGTGGGCGCCCCCTTCATAGGGTCACGTCAGCATGATTCGTCGGGCCGAGGGACATGACTGACGACCGTTGGCAATACCCCGACCTCTAAAATTGTCCAACAGTGTGGTAGGTTATCCTGGTGACGCGGTATGACGGTCGATGCGAGCGTGTAGAAAGATGACGAGAGAGTCATCTCACAACATTGCGTGCTGTTTGGATCATACACCCCTGTGGAGGGCTTACCAGAAAGTGGACGCAGAAAGCCACCAAAAGTGTCATGCCAGATACCTGGCCTCCTTCGCCGCCGCGACTGAAGACCTTCCTTTAATTCCGTTATCCTACTTACGACCGAGAGTCAGATCTGTCAGTAAAGATCGGTCTGTTGCTTTCCACGGACTGTGAAGAATCCGCTGTTCTAACCAGCCAGCCCATTATACGGATCGATTTTGAAGTAACCTAGTAGGCGAATCAGCGGCCGGGCCTGATGCTAGACTCCCTAGACAATTTCCTCTCCACGGAAGGTTCCTAATCCCTGGGAATTTGGCTTATACGGGCCTTGGACACTGTTAAACTTCAGAGTGATAATTTAATGGCGAAGCTCTACGCCAGCGACCGCCGAAGCTCGCACCTTTAGCCCCCCTGAGTGAAGAACACTCGGGAATCTGCTCTCCTTGCAACCAAGCAACGGCGGGGTAGATATGGTGGGTTTCATGACGGCCCGGGAAGCTCTGGTCATAGCAATACTTGGGTAGCTGTGATGAGGGTCCAAAACTTTTTGGGCCAAGGTTCGGACGACACCGTCCGATCGACTGCCTAACTACCTGTTCACCCCATCGATAGAGTACAGTCGAGGCCCCGCCCGACCCATACGTCAAGACAGTGACAATAGGTGCTTACGAGTTTCTATAATAAATTGTCGGGACGATGTCTGCCCGCCTACCTGAGTGCGTGCCCGATATGGGGCTTGCGGAAAACTATGAAATATTAGTATTGCCCGGGGGACTCAGTCGAGTATTTGTGGAGACTCCCATTGCACTACTACAGCACCATATTAAGCTTACTCAGATACGTTAGAACAATAGGGGATCCACTTAAAACATTACAGATCCCAATCGGTCTCCTTGTTAAGGAAAAGCGTTAACAGGTGTGGTGGCAGTTATATTTGTAATAGACTTATAATAGGGTATTCCAAGTTTATTGTGGATAACGTCTCAAACCTGTTCCACACCACGAGTGTGGGCAATGAGATCCTATTGGCACGTCGTTATAGTCTCAGTGCCTGAAGACACCTGAAAGCAGGCGCTGTGACGTGTACCCAGTGCCCTCTGCAACCGGGAACTAGGGTTACAGAGGGGAAACAAAAATGATCGCACGCTTTAATCCAATACCGTTTCCCGTCTCCCAAGGTGAGACACTCCGGGGTATAAGTCCAGCCTCTTGTACGGTCACGATTAGGCGAAAATCTACTGTCTACCTTCGGTGTGCATTGTCTTAGCGTCTTATCCAGAGAGGAATGGCTTTCGTCGTCGTCGCTAGTTTCGCTCGCTTGAGGTATAGTTAATAGCAAGACTACGAGTCCACTGCTTCATGTCTAATTCATCGGCAGCCCTGTTTGGATTGGAGCGTAGCTAGGACCCCCGAACCAGCCTTAACTATGAACGTTTGTCTTCAAATCTGGGCGCACGTACTTCGTAGGCTGGATATGCAGAATCTCGCCGTCGTGACGACGATCCGTTGTAGACGGCACAGCGTCTCTGACCGGCTTGAACTAATGCTGACAATTCTGACATAAGGTCTACGCATCCAGAAAGTGTAATGCATGTATGTATGCAGCCAAACGATAGTAGAGCCCTATCTCGCTTGAGAGGCACTTCCCTGTATGCAAATACCGATGTTTCTCCGCTTCATGTACTAAAACCCTGTGACCGACTAGTTGCACCTACGATTGTATGACACGACGGCCTTAGAGGCAGCAACGCGTGGTAGGCCGTTATGCGAGGAATTCTACTACAGTCGGGAGCCGCAGCGGAAGCAATTTTTTTACTCACGTTCCAGCATGCTGCAAACGGAAGCTGACACGGAGTCAATCGGGTAAATTTTGAGCAAATAAATCGCGACAACTAGTCCCGACTACGCTTTCGACACTGTCCGGCAGATTCCGTGCATCAATTAAACGTCATCAATCAATTACTGGCACGACTGTAGACGGGTGTACTCTTTTATAGACTCAGCAGTAGGACCTATGTGGAGCGGTCTACACATTGACGCAAGACACAAGAACTAGCGCGGATTGTTTGATTCGGTGACCTCTGAGGGTCGCTAAGCGACACCACAATGCGTTAGTGCTAACGTAAGAGAGCTCGATTGCTATATAGATGTCGGTATTCTTCAATGCATTTGCTTACTAGCAGCGTCGGATACTCTTGGCCGGGACCTTCTTATTAGTCAATTACAGAAACAGTTGAAAGCCCCACCAGTTGCATATACTACTGCCTCCATTGTTGATGACCTCAACTTGCCTACCAGGATTGGAGCACCGATGTTATTTCCTCCGAGGTATAACCGAGCGTCATAACTTGGATGTATCCAGACTCGCTTATCCCCTCGCTGAGCATATCCTAGTCTGGATGACTTCAGAGAGCCTTTCTGGTCCGTAATATCCCAGTAGACTGGAGTTGTAGCAAATCGACCCTTGGGTGACTGCCTCACCCTGAAGTGATGTCTCTTCTTTACCATGCAGGCACTGGTCTAGCCGCCGAGTATCTTCTGATCCTTCTAAGGGCTTATTCGAAACAGCTTAACAAATGACAGGCTGTGATGATATATTACGTTGACGCTACGGGGACAGCGCCTATGTCGGCCACTAGGGCTTCATCCGTTACTCAGGGTCAAATGGGGATTTCATATTGCGGGATCGATTGAAGATAGCATCACACGTCTCCCAAGATACGTCCCACTTTGGTTTTGGTCACTCCTTATTCCGCGACGGTAGTCCCGCGCTGTTGCAAACTCGTTTGAAGACGCCTAGTCAAGATTCACTTCGCGGATCCGGCATCTTCGAATGGTTGGGATCCAGACGAGCGTGGGCGTACTGCTTACGAGAACGACTCGGCAGTGTTAGAGTGTTATCTGAAGGAGATGCTAGTAACATAATATACAAATCTTTATGTTAGTAGACTGCACAAGTCAATATGGATACATAGGTCCATGGAAGAATGTTCACGCGTTACTTGTGTCTCGCCACGCGAGTGCATCTCCATAGAGCCTTCCTGTATCGTCACTTTCTCTCGATGGTCAGCGTTTCAATAATTCGCGAGCAACAACGTCGATCTCCGGGATATACGATCAGCCCAGAGTACAAGACCCGATATGCACGGCATGCAATATCCAGAGTCGGGCATACTTTATTGGACTGGTAAGTCTCTCCTGTCCACGCTGACTACAACTGAAGTAGTGTGACCTGACTGGCGCCTTCTACCACCCATGTCTCCAGCAATTGTCGCATCATACAGGTTCCCAGCGTAGCGTCGCCCCTTTGGCGCTTTCCTGCGGTATCGATATAATGAAATTTTCACCAACGTTGCGCTTATTCGCAAGGTGGCGAGATTGTATTATGCCACACAGCCTCCTAGAATATCCTAAGGCAGAGTTCGGTGACTTTTGCCGCTTTAGGCAGGACAGAGCTGTCCTTATCTTGGGACAGCACGTGCTTCGATATACTGCCCGCGCTTTCTCTGGGGACGCTTTAAGGTCTTTTTGCTGCGATTGCGCTATCCGAGCCACTGTATCTTATACCGACGTATCTCGGCCTCGTTACATAGAAAATACTGTCAGCGCTTGTAGCGAGACCACGCGATAGTGACCGGAGTTGGTTCCTCCGTCCTTTTTGTATTCCCCGTTGCGACTGATTCACGTGACCACATAGTCATAAGACACTGAAACAAAGCTTACTTTGGCGAGTAGGATGTGTTAATAACTTCTGGCAGCACATAGAATTGGTCCGTGGTCCTCCTTTGCGGCCACTACTGAACGTACCAATGAGTACGTATTGACCTCTTACTGAGTGTAGTAAGGGAGCATCAATCGGTCTCCGGGTTTTTGATTCATGAGTCATGCATCAGTGGTTCATCCCTTGCGTGTTATTCTCTTGATACGGTTGACTAAGCAATGAGTTAGTCGAGCTA";
        List<String> list = l.findRepeatedDnaSequences(s);
        long end = System.currentTimeMillis();
        for (String result : list) {
            System.out.println(result);
        }
        System.out.println(end-start);
    }


    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subStr = s.substring(i,i+10);
            if (strSet.contains(subStr)){
                result.add(subStr);
            }else{
                strSet.add(subStr);
            }
        }
        return new ArrayList<String>(result);
    }
}
