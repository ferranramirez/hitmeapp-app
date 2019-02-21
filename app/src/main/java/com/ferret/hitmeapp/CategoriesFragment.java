package com.ferret.hitmeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CategoriesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_categories, parent, false);
        return rootView;
    }

    private void getJson() {
        String json = "[{\"idMeetup\":1,\"name\":\"Art & Culture\",\"idEventBrite\":105},{\"idMeetup\":18,\"name\":\"Book Clubs\",\"idEventBrite\":0},{\"idMeetup\":2,\"name\":\"Career & Business\",\"idEventBrite\":101},{\"idMeetup\":3,\"name\":\"Cars & Motorcycles\",\"idEventBrite\":118},{\"idMeetup\":4,\"name\":\"Community & Environment\",\"idEventBrite\":113},{\"idMeetup\":5,\"name\":\"Dancing\",\"idEventBrite\":0},{\"idMeetup\":6,\"name\":\"Education & Learning\",\"idEventBrite\":115},{\"idMeetup\":8,\"name\":\"Fashion & Beauty\",\"idEventBrite\":106},{\"idMeetup\":9,\"name\":\"Sports & Fitness\",\"idEventBrite\":108},{\"idMeetup\":10,\"name\":\"Food & Drink\",\"idEventBrite\":110},{\"idMeetup\":11,\"name\":\"Games\",\"idEventBrite\":0},{\"idMeetup\":13,\"name\":\"Movements & Politics\",\"idEventBrite\":112},{\"idMeetup\":14,\"name\":\"Health & Wellbeing\",\"idEventBrite\":107},{\"idMeetup\":15,\"name\":\"Hobbies & Crafts\",\"idEventBrite\":119},{\"idMeetup\":16,\"name\":\"Language, Travel & Ethnic Identity\",\"idEventBrite\":109},{\"idMeetup\":12,\"name\":\"LGBT\",\"idEventBrite\":0},{\"idMeetup\":17,\"name\":\"Lifestyle\",\"idEventBrite\":117},{\"idMeetup\":20,\"name\":\"Movies & Film\",\"idEventBrite\":104},{\"idMeetup\":21,\"name\":\"Music\",\"idEventBrite\":103},{\"idMeetup\":22,\"name\":\"New Age & Spirituality\",\"idEventBrite\":0},{\"idMeetup\":0,\"name\":\"Science & Technology\",\"idEventBrite\":102},{\"idMeetup\":0,\"name\":\"Charity & Causes\",\"idEventBrite\":111},{\"idMeetup\":0,\"name\":\"Religion & Spirituality\",\"idEventBrite\":114},{\"idMeetup\":0,\"name\":\"Seasonal & Holiday\",\"idEventBrite\":116},{\"idMeetup\":0,\"name\":\"Other\",\"idEventBrite\":199},{\"idMeetup\":0,\"name\":\"School Activities\",\"idEventBrite\":120}]";
    }
}
