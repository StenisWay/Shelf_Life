package com.stenisway.shelflife.ui.login.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stenisway.shelflife.R
import com.stenisway.shelflife.ui.login.viewmodel.PasswordForgetViewModel

class PasswordForgetFragment : Fragment() {

    companion object {
        fun newInstance() = PasswordForgetFragment()
    }

    private lateinit var viewModel: PasswordForgetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_password_forget, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PasswordForgetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}