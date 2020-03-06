package com.example.fragmennba;

import java.util.ArrayList;

public class NbaDataProfile {
    private static String[] judul = new String[]{"Atlanta Hawks", "Boston Celtics",
            "Brooklyn Nets", "Charlotte BobCats", "Chicago Bulls", "Cleveland Cavaliers", "Dallas Mavericks",
            "Denver Nuggets", "Detroit Pistons", "Golden State Warriors", "Houston Rockets", "Indiana Pacers",
            "Los Angeles Clippers", "Los Angeles Lakers", "Memphis Grizzlies", "Miami Heat","Milwaukee Bucks",
            "Minnesota Timberwolves","New Orleans Hornets","New York Knickerbockers","Oklahoma City Thunder",
            "Orlando Magic","Philadelphia 76ers","Phoenix Suns","Portland Trail Blazers","Sacramento Kings",
            "San Antonio Spurs","Toronto Raptors","Utah Jazz","Washington Wizards"
    };
    private static int[]logo = new int[]{R.drawable.img_atlanta_hawks, R.drawable.img_boston_celtics,
            R.drawable.img_brooklyn_nets, R.drawable.img_charlotte_bobcats, R.drawable.img_chicago_bulls,
            R.drawable.img_cleveland_cavaliers, R.drawable.img_dallas_mavericks,
            R.drawable.img_denver_nuggets, R.drawable.img_detroit_pistons, R.drawable.img_golden_state_warriors,
            R.drawable.img_houston_rockets, R.drawable.img_indiana_pacers, R.drawable.img_los_angeles_clippers,
            R.drawable.img_los_angeles_lakers, R.drawable.img_memphis_grizzlies, R.drawable.img_miami_heat,
            R.drawable.img_milwaukee_bucks, R.drawable.img_minnesota_timberwolves, R.drawable.img_new_orleans_hornets,
            R.drawable.img_new_york_knicks, R.drawable.img_oklahoma_city_thunder, R.drawable.img_orlando_magic,
            R.drawable.img_philadelphia_76ers, R.drawable.img_phoenix_suns, R.drawable.img_portland_trail_blazers,
            R.drawable.img_sacramento_kings, R.drawable.img_san_antonio_spurs, R.drawable.img_toronto_raptors,
            R.drawable.img_utah_jazz, R.drawable.img_washington_wizards
    };
    private static int[]team = new int[]{R.drawable.img_zfoto_atlanta_hawks, R.drawable.img_zfoto_booston_celtics,
            R.drawable.img_zfoto_brooklyn_nets, R.drawable.img_zfoto_charlotte_bobcatshornet, R.drawable.img_zfoto_chicago_bulls,
            R.drawable.img_zfoto_cleveland_cavaliers, R.drawable.img_zfoto_dallas_mavericks,
            R.drawable.img_zfoto_denver_nuggets, R.drawable.img_zfoto_detroit_pistons, R.drawable.img_zfoto_golden_state_warriors,
            R.drawable.img_zfoto_houston_rockets, R.drawable.img_zfoto_indiana_pacers, R.drawable.img_zfoto_los_angeles_clippers,
            R.drawable.img_zfoto_los_angeles_lakers, R.drawable.img_zfoto_memphis_grizzlies, R.drawable.img_zfoto_miami_heat,
            R.drawable.img_zfoto_milwaukee_bucks, R.drawable.img_zfoto_minnesota_timberwolves, R.drawable.img_zfoto_new_orleans_hornets,
            R.drawable.img_zfoto_new_york_knicks, R.drawable.img_zfoto_oklahoma_city_thunder, R.drawable.img_zfoto_orlando_magic,
            R.drawable.img_zfoto_philadelphia_76ers, R.drawable.img_zfoto_phoenix_suns, R.drawable.img_zfoto_portland_trail_blazers,
            R.drawable.img_zfoto_sacramento_kings, R.drawable.img_zfoto_san_antonio_spurs, R.drawable.img_zfoto_toronto_raptors,
            R.drawable.img_zfoto_utah_jazz, R.drawable.img_zfoto_washington_wizards
    };

    public static ArrayList<NbaModelProfile> getListData2(){
        NbaModelProfile nbaModelProfile = null;
        ArrayList<NbaModelProfile> list = new ArrayList<>();
        for (int i = 0;i<judul.length;i++){
            nbaModelProfile = new NbaModelProfile();
            nbaModelProfile.setJudul(judul[i]);
            nbaModelProfile.setLogo(logo[i]);
            nbaModelProfile.setTeam(team[i]);
            list.add(nbaModelProfile);
        }
        return list;
    }
}
