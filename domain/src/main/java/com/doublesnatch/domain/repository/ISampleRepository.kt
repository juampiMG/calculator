package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.SampleDomain
import io.reactivex.Completable
import io.reactivex.Single

interface ISampleRepository {
     fun getSamples(): Completable
}