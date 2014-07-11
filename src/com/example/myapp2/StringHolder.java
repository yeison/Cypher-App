package com.example.myapp2;

import android.util.SparseArray;

public class StringHolder {
	
	private static final SparseArray<String> stringMap  = new SparseArray<String>();
	
	static {	
		stringMap.put(1, ".sretcarahc eht lla fo redro eht esrever ot desu erudecorp eht si mhtirogla ehT  .egassem etairporppa eht laever ot si laog eht esac siht nI  .mhtirogla na sa nwonk si laog a hsilpmocca ot erudecorp pets yb pets A  .redro esrever ni nettirw eb tsum sretcarahc eht fo lla ,ti laever ot redro nI  .egassem terces a si sihT");
		stringMap.put(2, "Placeholder");
		stringMap.put(3, "Placeholder");
	}
	
	public static String get(Integer key){
		return stringMap.get(key);
	}

}
