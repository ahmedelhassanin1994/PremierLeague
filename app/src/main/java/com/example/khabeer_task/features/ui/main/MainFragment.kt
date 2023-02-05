package com.example.khabeer_task.features.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.khabeer_task.databinding.FragmentMainBinding
import com.example.khabeer_task.features.domain.entities.Matches_Entities
import com.raminabbasiiii.movies.util.Status
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment : Fragment() {



    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding
    private  val TAG = "MainFragment"
    lateinit var adapter : CustomAdapter
    lateinit var mList: ArrayList<Matches_Entities>




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding = FragmentMainBinding.inflate(layoutInflater)
        binding.mainViewModel = viewModel
        viewModel.get_data()
        go_home();
        return binding.getRoot()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        go_home()

    }
    fun go_home(){
        viewModel.movieDetails.observe(viewLifecycleOwner) { result ->
            when(result.status) {
                Status.LOADING -> {
                }
                Status.SUCCESS -> {

//                    Log.d(TAG, "go_home:  ${result.data!!.matches.size}")
                    mList =result.data!!.matches
                    adapter=CustomAdapter(mList)
                    binding.recylerview.setHasFixedSize(true);
                    binding.recylerview.adapter = adapter
                    binding.recylerview.setAdapter(adapter);
                    binding.recylerview.layoutManager= LinearLayoutManager(getActivity())
                    adapter.notifyDataSetChanged()
                }
                Status.ERROR -> {

                }
            }
        }

    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}