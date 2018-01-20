/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.sunshine.utilities.OpenWeatherJsonUtils;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView tWeatherDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        tWeatherDisplay = (TextView) findViewById(R.id.tv_weather_data);
        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weatherData = {
                //date - conditions - high/low
                "Current - Clear - 35°F/10°F",
                "Tomorrow - Calm - 40°F/25°F",
                "Sunday - Dread - 50°F/40°F",
                "Monday - Impending Doom - 60°F/50°F",
                "Tuesday - Imminent Death - 53°F/34°F",
                "Wednesday - Eternal Despair - 46°F/28°F",
                "Thursday - Stormy Daniels - 43°F/27°F"
        };
        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String forecast : weatherData) {
            tWeatherDisplay.append(forecast + "\n\n\n");
        }
    }
}