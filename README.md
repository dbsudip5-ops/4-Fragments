Buttons Navigation 

Step 2: Update MainActivity.kt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // auto-generated from activity_main.xml

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load default fragment
        replaceFragment(FragmentOne())

        // Button clicks
        binding.btnOne.setOnClickListener { replaceFragment(FragmentOne()) }
        binding.btnTwo.setOnClickListener { replaceFragment(FragmentTwo()) }
        binding.btnThree.setOnClickListener { replaceFragment(FragmentThree()) }
        binding.btnFour.setOnClickListener { replaceFragment(FragmentFour()) }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}


✅ Pros: Safe, modern, no deprecated code.

Option 2: Use findViewById (Simple)
class MainActivity : AppCompatActivity() {

    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button
    private lateinit var btnFour: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne = findViewById(R.id.btnOne)
        btnTwo = findViewById(R.id.btnTwo)
        btnThree = findViewById(R.id.btnThree)
        btnFour = findViewById(R.id.btnFour)

        // Load default fragment
        replaceFragment(FragmentOne())

        btnOne.setOnClickListener { replaceFragment(FragmentOne()) }
        btnTwo.setOnClickListener { replaceFragment(FragmentTwo()) }
        btnThree.setOnClickListener { replaceFragment(FragmentThree()) }
        btnFour.setOnClickListener { replaceFragment(FragmentFour()) }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}


✅ Pros: Very simple, works in any project without extra setup.
