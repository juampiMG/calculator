package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.SampleDomain
import io.reactivex.Single

interface ISampleRepository {
     fun getSamples(): Single<SampleDomain>
}