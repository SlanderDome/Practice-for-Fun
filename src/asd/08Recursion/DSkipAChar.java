    public class DSkipAChar {
        

        public static void main(String[] args) {
            String str="ABAbGhjIA";
            char Skip='A';
            int index=0;
            skip(str,Skip,0);
        }

        static void skip(String str,char Skip,int index){

            String [] arr={};
            if(index>str.length()){
                return;
            }
            if(str.charAt(index)!=Skip){
                skip(str,Skip,index+1);
            }
            else{
                str=str.replace(String.valueOf(Skip),"");
                skip(str,Skip,index+1);
            }
            System.out.println(str);

        
        }
    }
