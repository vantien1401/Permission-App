package com.dongnh.permissionsummary.di

import com.dongnh.permissionsummary.viewmodel.DetailAppViewModel
import com.dongnh.permissionsummary.viewmodel.ListPermissionViewModel
import com.dongnh.permissionsummary.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { ListPermissionViewModel(get()) }
    viewModel { DetailAppViewModel(get()) }
}