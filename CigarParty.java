public class CigarParty {
    public boolean cigarParty(int cigar, boolean isWeekend){
        if (!(isWeekend))
            return (cigar>=40 && cigar<=60);
        else if(isWeekend)
            return (cigar>=40);
        else
            return false;

    }
}
