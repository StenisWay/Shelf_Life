package com.stenisway.shelflife.ui.main.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stenisway.shelflife.R
import com.stenisway.shelflife.ui.main.viewmodel.ExpiredFoddViewModel

class ExpiredFoodFragment : Fragment() {

    companion object {
        fun newInstance() = ExpiredFoodFragment()
    }

    private lateinit var viewModel: ExpiredFoddViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_expired_food, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExpiredFoddViewModel::class.java)
        // TODO: Use the ViewModel
    }

}