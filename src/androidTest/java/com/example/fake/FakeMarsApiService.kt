package com.example.fake

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.DefaultAppContainer

class FakeMarsApiService: DefaultAppContainer.MarsApiService {
    override suspend fun getPhotosPerro(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }

}