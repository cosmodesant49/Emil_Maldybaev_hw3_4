package com.geeks.emil_maldybaev_hw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.emil_maldybaev_hw4.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<Country>countryArrayList;
    private CountryAdapter adapter;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        adapter = new CountryAdapter(countryArrayList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void checkPosition(int position) {
        if (position == 0){
            loadEurasia();
        }
        else if (position == 1){
            loadAfrica();
        }
        else if (position == 2) {
            loadSouthAmerica();
        }
        else if (position == 3) {
            loadNorthAmerica();
        }
        else if (position == 4) {
            loadAustralia();
        }
    }
    private void loadAustralia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Норфолк","https://flagstore.com.ua/wp-content/uploads/2019/04/Купить-флаг-острова-Норфолк.jpg"));
        countryArrayList.add(new Country("Фиджи","https://primaryleap.co.uk/images/wikileap/post_inner_image/thumb_orignal/e63b02685b523ca5f69371e1f589747ba2a71c28sM.jpg"));
        countryArrayList.add(new Country("Вануату","https://www.a1flags.com.au/images/Catalogue/Flag/vanua.svg"));
        countryArrayList.add(new Country( "Тонга","https://www.vdio.com/wp-content/uploads/2017/04/national-flag-of-Tonga-1000x600.png"));
        countryArrayList.add(new Country("Самоа","https://www.bestcustomflags.com/wp-content/uploads/2016/06/western-samoa-flag.jpg"));
    }

    private void loadAfrica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Египет","https://i.pinimg.com/originals/42/a6/dc/42a6dc56083b3c79b09a22ef7375a335.jpg"));
        countryArrayList.add(new Country("Марокко","https://flagof.ru/wp-content/uploads/2018/10/Flag_of_Morocco_1slash6.svg_.png"));
        countryArrayList.add(new Country( "Алжир","https://ak.picdn.net/shutterstock/videos/1012866902/thumb/1.jpg"));
        countryArrayList.add(new Country("Тунис","https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/1599px-Flag_of_Tunisia.svg.png"));
        countryArrayList.add(new Country("Мадагаскар","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Madagascar.svg/1599px-Flag_of_Madagascar.svg.png"));
    }

    private void loadEurasia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Кыргызстан","https://trafopedia.ru/storage/app/uploads/public/60a/970/6dd/60a9706dd4c33675091156.png"));
        countryArrayList.add(new Country("Казахстан","https://permtpp.ru/upload/medialibrary/a72/kazakhstan_flag_13_1024x614.jpg"));
        countryArrayList.add(new Country("Грузия","https://i.pinimg.com/originals/54/38/5e/54385ec1aa40f8ff11f012773152faa2.png"));
        countryArrayList.add(new Country("Греция","https://w-dog.ru/wallpapers/15/12/461588723649945/flag-greciya-sinij-belyj.jpg"));
        countryArrayList.add(new Country("Польша","https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Flag_of_the_Duchy_of_Warsaw.svg/1600px-Flag_of_the_Duchy_of_Warsaw.svg.png"));
    }

    private void loadSouthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Бразилия","https://fs.onclass.com/storage/5b1ab4bc-eb36-4bf5-8d97-a06a55922971/989106a0-23a1-422c-a96c-ca3c77a15322/6d66deed930ec38882d516c38c18b4f3-lgX2.jpg"));
        countryArrayList.add(new Country("Чили","https://i.ytimg.com/vi/7D1vZAXk1xI/maxresdefault.jpg"));
        countryArrayList.add(new Country("Суринам","https://static.vecteezy.com/system/resources/previews/023/589/729/original/flag-of-suriname-national-flag-of-suriname-free-vector.jpg"));
        countryArrayList.add(new Country("Венесуэла","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/State_flag_of_Venezuela_%281954–2006%29.svg/1599px-State_flag_of_Venezuela_%281954–2006%29.svg.png"));
        countryArrayList.add(new Country("Перу","https://w.forfun.com/fetch/5f/5f73ced07706bf62c84d46c76335ea8b.jpeg"));
    }
    private void loadNorthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Канада","https://i3.wp.com/bookmaker-ratings.ru/wp-content/uploads/2023/05/3-222-canada-flag-transparent.png?ssl=1"));
        countryArrayList.add(new Country("Мексика","https://s1.1zoom.ru/b5050/706/339091-Berserker_2560x1440.jpg"));
        countryArrayList.add(new Country("Куба","https://www.rst.gov.ru/wcmRST/image-api/view.ido?uuid=1580116935780"));
        countryArrayList.add(new Country("Ямайка","https://s3-eu-west-1.amazonaws.com/images.linnlive.com/f1a39bbafe606f99f3f778affa81564d/bd8074b6-2906-483f-adeb-ebee836e528b.jpg"));
        countryArrayList.add(new Country("Барбадос","https://cdn.worldvectorlogo.com/logos/barbados.svg"));
    }

}