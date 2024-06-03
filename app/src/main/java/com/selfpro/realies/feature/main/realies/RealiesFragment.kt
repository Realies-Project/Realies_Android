package com.selfpro.realies.feature.main.realies

import androidx.fragment.app.viewModels
import com.selfpro.realies.R
import com.selfpro.realies.databinding.FragmentRealiesBinding
import com.selfpro.realies.util.base.BaseFragment

class RealiesFragment: BaseFragment<FragmentRealiesBinding, RealiesViewModel>(R.layout.fragment_realies) {
    override val viewModel: RealiesViewModel by viewModels()

    override fun start() {

    }
}