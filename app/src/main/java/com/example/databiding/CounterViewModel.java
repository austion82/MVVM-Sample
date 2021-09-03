package com.example.databiding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    /*
        LiveData
         - ovservable 패턴을 사용, 데이터 변화를 구독한 곳으로 통지하고, 업데이트 한다.
         - 메모리 누수없는 사용 보장
         - 항상 최신 데이터 유지

         LiveData, MutableData 차이
          - Mutable adj. 변할수 있는
          - liveData - get()
          - MutableLiveData = get(), set()

     */
    public MutableLiveData<Integer> counter = new MutableLiveData<Integer>();

    public CounterViewModel() {
        counter.setValue(0);
    }

    public void plus() {
        counter.setValue(counter.getValue()+1);
    }

    public void minus() {
        counter.setValue(counter.getValue()-1);
    }
}
