package first;
import java.util.*;

public class TelephoneClass {
/**
* @param args
*/
HashMap<Long,String> hm = new HashMap<Long,String>();
ArrayList<Long> callList = new ArrayList<Long>();
ArrayList<CallerD> missedcall = new ArrayList<CallerD>();

@SuppressWarnings("deprecation")

void createCaller()
{
hm.put(new Long("9898080099"),"Hari M");
hm.put(new Long("9898087654"),"Lankesh M");
hm.put(new Long("9898897843"),"Lucky");
}
}