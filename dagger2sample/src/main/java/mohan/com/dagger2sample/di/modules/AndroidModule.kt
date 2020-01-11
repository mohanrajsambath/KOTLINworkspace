package mohan.com.dagger2sample.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides


@Module
public class AndroidModule(private val application: Application) {
    @Provides
    fun provideApplicationContext():Context=application

}
