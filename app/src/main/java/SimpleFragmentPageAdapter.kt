import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SimpleFragmentPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Fragment_1()
            }
            1 -> {
                Fragment_2()
            }
            else -> {
                Fragmnet_3()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}
