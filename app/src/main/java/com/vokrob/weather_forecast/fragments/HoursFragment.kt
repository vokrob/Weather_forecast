package com.vokrob.weather_forecast.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vokrob.weather_forecast.adapters.WeatherAdapter
import com.vokrob.weather_forecast.adapters.WeatherModel
import com.vokrob.weather_forecast.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRcView()
    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter

        val list = listOf(
            WeatherModel(
                "", "12:00",
                "Sunny", "25°C",
                "", "", "", ""
            ),
            WeatherModel(
                "", "13:00",
                "Sunny", "27°C",
                "", "", "", ""
            ),
            WeatherModel(
                "", "14:00",
                "Sunny", "35°C",
                "", "", "", ""
            ),
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}




















