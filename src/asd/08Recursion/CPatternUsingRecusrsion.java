
public class CPatternUsingRecusrsion {
    public static void main(String[] args) {
        //patternone(4, 0);
        patterntwo(4, 0);
        
    }

static void patternone(int row,int col){
    if (row==0){
        return;
    }
    if(col<row){
        System.out.print("*");
        patternone(row, col+1);
        
    }
    else{System.out.println();
       patternone(row-1, 0);
    }
    
}

static void patterntwo(int row,int col){
   if (row==0){
        return;
    }
    if(col<row){
        patterntwo(row, col+1);
        System.out.print("*");
        
        
    }
    else{   patterntwo(row-1, 0);
        System.out.println();
    
    }
}
}
