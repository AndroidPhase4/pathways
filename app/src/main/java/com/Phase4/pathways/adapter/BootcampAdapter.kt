package com.Phase4.pathways.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R

class BootcampAdapter (val bootcamp: List<Bootcamp>) : RecyclerView.Adapter<BootcampViewHolder>() {


    private var titles = arrayOf("Flatiron School", "Fullstack Academy", "Hack Reactor", "Lambda School",
        "App Academy", "General Assembly", "Tech Talent South", "Wynode", "Data Science Dojo",
        "The Tech Academy", "TechPro Education")

    private var description = arrayOf(
        "Based in New York, the Flatiron School boasts nine locations across the U.S., along with a virtual campus. Founded in 2012 as an accelerated coding school in Manhattan's Flatiron District, the institution now offers courses in software engineering, data science, cybersecurity, and UX/UI design.\n" +
                "Flatiron's flagship software engineering course lasts 15 weeks and immerses participants in full-stack web development, Javascript, and Ruby on Rails. Other programs, like cybersecurity, take 12 weeks. Online classes run in full-time, part-time, or self-paced sessions.\n" +
                "The school aims to remove the financial barrier to education through flexible finance options like income-share agreements. Each enrollee signs a contract, makes a modest deposit, and then pays nothing until after finding a job and earning income at a minimum threshold.\n" +
                "Admissions counselors use an interview-based process to determine whether applicants will fit into the Flatiron culture. The school offers career services and publishes an externally audited jobs report for learners to explore outcomes. Flatiron also provides a money-back guarantee for certain programs.\n",
        "Established in 2012 in New York, Fullstack hosts classes in coding in Manhattan, Chicago, and online. The school offers full-time and part-time coursework in coding, cybersecurity, and web development. This institution emphasizes problem-solving, along with writing efficient, secure, and maintainable code. As a founding member of the Council on Integrity in Results Reporting (CIRR), Fullstack believes in outcomes transparency, giving students a guarantee of quality.\n" +
                "Fullstack's instruction starts before admission. The institution offers inexpensive prep programs to ready students for intensive bootcamps. Its JavaScript-based curriculum opens with a deep immersion in the bedrock principles of computer science, including data structures, algorithms, run-time analysis, object-oriented programming, databases, and software design.\n" +
                "Enrollees work in cohorts to learn about front-end and back-end development. In the latter stages of the program and beyond, instructors match participants' interests with potential employers. Alumni now work at companies such as Google, Spotify, eBay, and LinkedIn. The school offers a tuition-deferred program for women.\n",
        "Hack Reactor boasts more than 8,000 alumni. With locations in eight major U.S. cities and online, the school provides comprehensive software engineering instruction. Students receive 800 hours of computer science and JavaScript training over three months in on-site and remote programs. The company also hosts a nine-month, part-time online option.\n" +
                "The school uses a 2-4 month admissions process. Prospective students begin by engaging in an introductory curriculum before completing projects, passing assessments, and finishing a precourse. Learners who make it through the rigorous admissions process gain acceptance into the bootcamp. The basic prep course is available for free.\n" +
                "Hack Reactor offers transparency through CIRR and connects students with reputable loan companies. The company has landed alumni at organizations like Google, Apple, Yelp, and NASA.\n",
        "Established in 2016, Lambda ranks among the most high-profile coding bootcamps to offer a deferred payment plan. The Silicon Valley school uses an online format to offer programs in data science, full-stack web, and iOS development. Classes meet in real time. Students collaborate under the guidance of team leads.\n" +
                "Like many bootcamps, Lambda requires each applicant to complete precourse work before enrolling in one of its three tracks. Individuals interested in the web-development track must also pass tests before enrolling.\n" +
                "In Lambda's deferred payment model, enrollees may pay nothing upfront and only repay their tuition after landing a job that pays \$50,000 or more. When they receive that new position, they pay 15% of their salary for two years.\n" +
                "The company's rigorous career services arm connects learners with its network of alumni, employee partners, and local mentors to help get them hired.\n",
        "Launched in 2012, App Academy offered the first deferred tuition plan among coding bootcamps. With campuses in San Francisco, New York, and online, the bootcamp features a very selective acceptance rate. Admitted learners join a class of smart, determined, like-minded individuals.\n" +
                "App Academy offers full-time, immersive classes through online or in-person delivery. Industry leaders helped the company design and adapt its curriculum to meet the needs of today's employers. The curriculum comprises rigorous, in-depth coursework in developing client and server software.\n" +
                "The school aims to turn students into full-stack software engineers in just 16 weeks. Students who complete pre-bootcamp training significantly improve their chance of admission.\n" +
                "App Academy also caps its max tuition, never taking more than 28% of the first qualifying salary of those who opt in. In 2019, App Academy saw 306 graduates out of its San Francisco location. These graduates earned an average first-year salary of \$104,040. App Academy's 226 New York graduates in that same year reported an average first-year salary of \$86,910.\n",
        "Among the largest bootcamps, General Assembly began in 2011 in New York and now features more than 30 campuses worldwide. The bootcamp has helped over 16,000 immersive graduates land roles in their areas of interest. General Assembly offers diverse online and in-person programs, along with training programs through employers.\n" +
                "General Assembly's courses include full-time immersions in software engineering, data science, UX design, and digital marketing. The company's part-time offerings include Python programming, data analytics, product management, and visual design.\n" +
                "The program also features short-term classes in data analysis, UX design, JavaScript development, and digital marketing. Most of General Assembly's programs allow for upfront payments, and the company hosts a Catalyst Program with an income-share agreement.\n",
        "Headquartered in Charlotte, North Carolina, TTS hosts coding seminars, workshops, and bootcamps in more than a dozen cities. These programs include immersive, eight-week seminars in Java and two-day classes in Google Analytics. Most of the school's offerings fall into four categories: front-end, back-end, programming, and web development. The company also built a reputation for its corporate training programs.\n" +
                "TTS courses primarily suit beginners through full-time and part-time options. Typical camps last 8-10 weeks, though the company also offers four-week courses in advanced coding. Students can receive immediate help from mentors or tutors if they struggle with a topic. Once they go through camp, TTS places graduates in a customized \"talent pipeline,\" using corporate partnerships to help land jobs.\n" +
                "The school offers several payment options, but most entail upfront payments or installment plans.\n",
        "Wyncode hosts coding bootcamps in full-stack web development and UX/UI design at its headquarters in Miami and online. The company earned the distinction as the first coding bootcamp licensed by the Florida Department of Education's Commission for Independent Education.\n" +
                "Students in the 10-week full-stack program complete 350 hours of instruction and write 5,000 lines of code or more. Accepted students receive precourse instruction to become comfortable with the bootcamp's languages.\n" +
                "The cohort-based UX/UI program also runs for 10 weeks, exploring the design, strategy, and performance of customer-facing products. Courses include professional development to prepare students to pursue employment.\n" +
                "Wyncode provides students in the full program with an income-share agreement if they prefer to pay once they enter the workforce. The company also offers graduates lifetime job support. Alumni found employment with Miami startups and industry giants like Amazon, Microsoft, Udacity, and Magic Leap.\n",
        "Data Science Dojo offers diverse courses that often take less than a week to complete. Some, like the Internet of Things bootcamp, require just two days. Others take place over five days. Its most comprehensive offering, however, stretches over six months. The school also hosts corporate training sessions for an extensive list of companies.\n" +
                "Data Science Dojo's main curriculum explores the fundamentals of data science. Alumni can log in to recorded bootcamp sessions or use the school's 50 additional exercises to enhance their skills. Graduates of the 26-week practicum program automatically gain access to a 12-week internship to develop additional practical experience.\n" +
                "Only learners in the practicum program receive job placement services. The school partners with the University of New Mexico to offer a data science certificate program backed by an accredited university.\n" +
                "The school boasts thousands of graduates working at over 2,000 companies. Data Science Dojo provides several payment plan options, including monthly installments.\n",
        "The Portland, Oregon-based Tech Academy opened in 2014 and now features campuses in Portland and Utah. Its bootcamps include software development, C# and .net framework, Python development, and front-end web development. These bootcamps require 8-22 weeks of full-time study, with part-time programs typically taking longer.\n" +
                "Tech Academy's bootcamps include individual courses in basic computer technology, JavaScript, data control, and project management. A job placement course teaches participants what they need to enter new roles in the field. Most of the school's students enroll online.\n" +
                "The school offers an income-share agreement for some of its bootcamps but recommends that students make upfront payments or set up installment plans to save money. It offers externally audited outcome data through CIRR.\n",
        "TechPro Education offers online boot camps in Data Science (26 weeks), Full Stack Automation Engineer (21 weeks), Cyber Security (16 weeks), AWS & DevOps Engineering (21 weeks), Full Stack Mobile Developer (24 weeks), Full Stack Java Developer (24 weeks), Back End Developer (24 weeks), Salesforce Developer (14 weeks), and Front End Developer (18 weeks). \n" +
                "TechProEducation offers mentorship and 1:1 tutoring sessions to students needing extra support. Students should expect to commit 24 hours per week to their bootcamp program. No prior technical background is required to enroll in TechProEducation bootcamps. TechProEducation bootcamp students do receive career assistance, including a 6-month internship placement and job application preparation. Upon graduation, TechProEducation bootcamp students will receive a certificate of completion.\n",

    )
//
//    private var image = arrayOf(
//
//    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootcampViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bootcamp_list, parent, false)
        return BootcampViewHolder(view)
    }

    override fun onBindViewHolder(holder: BootcampViewHolder, position: Int) {

        holder.textViewTitle.text = titles[position]
        holder.textViewDesc.text = description[position]
//        holder.imageView.image = image[position]

    }

    override fun getItemCount(): Int {
        return titles.size
    }
}

class BootcampViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView: ImageView = itemView.findViewById(R.id.bootcamp_image)
    var textViewTitle: TextView = itemView.findViewById(R.id.bootcamp_title)
    var textViewDesc: TextView = itemView.findViewById(R.id.bootcamp_desc)
}