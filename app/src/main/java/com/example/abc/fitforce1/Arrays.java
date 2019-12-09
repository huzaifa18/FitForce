package com.example.abc.fitforce1;

import android.content.Context;
import android.util.Log;

import com.example.abc.fitforce1.Models.DietModel;
import com.example.abc.fitforce1.Models.WorkOutDetailsModel;
import com.example.abc.fitforce1.Models.WorkOutStatusModel;

import java.util.ArrayList;
import java.util.Calendar;

public class Arrays {

    //Build Muscle Work Out
    public static ArrayList<WorkOutDetailsModel> mondayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Bench Press","Lie back on a flat bench. " +
                "Using a medium width grip (a grip that creates a 90-degree angle in the middle of the " +
                "movement between the forearms and the upper arms), lift the bar from the rack and " +
                "hold it straight over you with your arms locked.","10","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday1_barbell_bench_press));
        add(new WorkOutDetailsModel(1,"Flat Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday2_flat_dumbell_fly));
        add(new WorkOutDetailsModel(2,"Incline Bench Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday3_incline_bench_press));
        add(new WorkOutDetailsModel(3,"Incline Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday4_incline_dumbbell_fly));
        add(new WorkOutDetailsModel(4,"Peck Deck Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","6","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday5_peck_deck_fly));
        add(new WorkOutDetailsModel(5,"Flat Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday6_flat_dumbell_press));
        add(new WorkOutDetailsModel(6,"Incline Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday7_incline_dumble_press));
        add(new WorkOutDetailsModel(7,"Dumbel Pullover","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","3","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday8_dumbell_pullover));
    }};

    public static ArrayList<WorkOutDetailsModel> tuesdayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{

        add(new WorkOutDetailsModel(8,"Lat Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday_1_lat_pulldown));

        add(new WorkOutDetailsModel(9,"One Arm Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday2_one_arm_row));
        add(new WorkOutDetailsModel(10,"Reverse Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday3_reverse_grip_pull_down));
        add(new WorkOutDetailsModel(12,"Barbel Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday4_barbell_row));
        add(new WorkOutDetailsModel(13,"Close Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday5_close_grip_pulldown));
        add(new WorkOutDetailsModel(14,"Rack Pull","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday6_rack_pull));
    }};

    public static ArrayList<WorkOutDetailsModel> wednesdayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(15,"Dumbel Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday_1_dumbell_curl));
        add(new WorkOutDetailsModel(16,"Pre Archer Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday2_preacher_curl));
        add(new WorkOutDetailsModel(17,"One Arm Bicep Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday3_one_arm_bicep_curl));
        add(new WorkOutDetailsModel(18,"One Arm Concentration Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday4_one_arm_concentration_curl));
        add(new WorkOutDetailsModel(19,"Barbel Curl Wide Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday5_barbell_curl_wide_grip));
        add(new WorkOutDetailsModel(20,"Barbel Curl Close Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday6_barbel_curl_close_grip));
        add(new WorkOutDetailsModel(21,"Plate Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","25","2",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday7_plate_curl));
    }};

    public static ArrayList<WorkOutDetailsModel> thursdayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(22,"Triceps Pushdown","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thurday_1_triceps_pushdown));
        add(new WorkOutDetailsModel(23,"Over Head Extension","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday2_over_head_extension));
        add(new WorkOutDetailsModel(24,"Skull Crusher","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday3_skullcrusher));
        add(new WorkOutDetailsModel(25,"Triceps Bench Press","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday4_tricep_bench_press));
        add(new WorkOutDetailsModel(26,"Triceps Push Down Reverse Grip","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday5_tricep_push_down_reverse_grip));
        add(new WorkOutDetailsModel(27,"Triceps Kickbacks","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday6_tricep_kickbacks));
        add(new WorkOutDetailsModel(28,"Diamond Pushups","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","10","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday7_diamond_push_ups));
    }};

    public static ArrayList<WorkOutDetailsModel> fridayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(29,"Arnold Dumbell Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","15","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday_1_arnold_dumbbell_press));
        add(new WorkOutDetailsModel(30,"Barbel Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday2_barbel_press));
        add(new WorkOutDetailsModel(31,"Front Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday3_front_raise));
        add(new WorkOutDetailsModel(32,"Upright Row","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday4_upright_row));
        add(new WorkOutDetailsModel(33,"Side Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday5_side_raise));
        add(new WorkOutDetailsModel(34,"Face Pull","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday6_face_pull));
        add(new WorkOutDetailsModel(35,"Dumbel Shrug","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday7_dumbell_shrug));
        add(new WorkOutDetailsModel(36,"Bend Over Fly","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","25","3",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday8bend_over_fly));
    }};

    public static ArrayList<WorkOutDetailsModel> saturdayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(37,"Barbel Squat","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday_1_barbell_squat));
        add(new WorkOutDetailsModel(38,"Stationary Lunges Dumbel","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday2_stationary_lungs_dumbell));
        add(new WorkOutDetailsModel(39,"Dead Lifts","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday3_dead_lifts));
        add(new WorkOutDetailsModel(40,"Seated Extensions","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","12","4",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday4_seated_leg_extension));
        add(new WorkOutDetailsModel(41,"Seated Leg Curls","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday5_seated_leg_curl));
        add(new WorkOutDetailsModel(42,"Standing Calve Raise","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","6",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday6_standing_calve_raise));
    }};

    public static ArrayList<WorkOutDetailsModel> sundayWorkoutBuildMuscle = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(43,"Curl Ups","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday_1_curl_ups));
        add(new WorkOutDetailsModel(44,"Reverse Crunches","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday2_reverse_crunches));
        add(new WorkOutDetailsModel(45,"Wipers","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday3_wipers));
        add(new WorkOutDetailsModel(46,"Leg Raises","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday4_leg_raise));
        add(new WorkOutDetailsModel(47,"V Sit Hold","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday5_v_sit_hold));
        add(new WorkOutDetailsModel(48,"Side Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday6_side_plank));
        add(new WorkOutDetailsModel(49,"Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday7_plank));
    }};

    //Loose Weight Work Out
    public static ArrayList<WorkOutDetailsModel> mondayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(50,"High Knees","Lie back on a flat bench. " +
                "Using a medium width grip (a grip that creates a 90-degree angle in the middle of the " +
                "movement between the forearms and the upper arms), lift the bar from the rack and " +
                "hold it straight over you with your arms locked.","25","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday1_high_knees));
        add(new WorkOutDetailsModel(51,"Wall Sit","Lie down on a flat bench with" +
                " a dumbbell on each hand resting on top of your thighs. ... " +
                "Then using your thighs to help raise the dumbbells, " +
                "lift the dumbbells one at a time so you can hold " +
                "them in front of you at shoulder width with the " +
                "palms of your hands facing each other.","30","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday2_flat_dumbell_fly));
        add(new WorkOutDetailsModel(52,"Plank","Lie down on a flat bench " +
                "with a dumbbell on each hand resting on top of your thighs. ... Then using your " +
                "thighs to help raise the dumbbells, lift the dumbbells one at a time so you can " +
                "hold them in front of you at shoulder width with the palms of your hands facing each other.",
                "10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday7_plank));
        add(new WorkOutDetailsModel(53,"Push Ups","Lie down on a flat bench " +
                "with a dumbbell on each hand resting on top of your thighs. ... Then using your " +
                "thighs to help raise the dumbbells, lift the dumbbells one at a " +
                "time so you can hold them in front of you at shoulder width with the palms of your " +
                "hands facing each other.","10","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday4_push_ups));
        add(new WorkOutDetailsModel(54,"Fire Feet","Lie down on a flat bench with a" +
                " dumbbell on each hand resting on top of your thighs. ... Then using your thighs to" +
                " help raise the dumbbells, lift the dumbbells one at a time so you can hold them in" +
                " front of you at shoulder width with the palms of your hands facing each other.",
                "12","6","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday5_fire_feet));
        add(new WorkOutDetailsModel(55,"Leg Raise","Lie down on a flat bench with" +
                " a dumbbell on each hand resting on top of your thighs. ... Then using your thighs " +
                "to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in" +
                " front of you at shoulder width with the palms of your hands facing each other.",
                "10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday6_leg_raise));
        add(new WorkOutDetailsModel(56,"Jumping Jacks","Lie down on a flat bench" +
                " with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs " +
                "to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in" +
                " front of you at shoulder width with the palms of your hands facing each other.",
                "10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday7_jumping_jacks));
        add(new WorkOutDetailsModel(57,"Squats","Lie down on a flat bench with" +
                " a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to" +
                " help raise the dumbbells, lift the dumbbells one at a time so you can hold them in" +
                " front of you at shoulder width with the palms of your hands facing each other.",
                "12","3","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday8_squats));
    }};

    public static ArrayList<WorkOutDetailsModel> tuesdayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(5,"Lat Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","4",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday_1_lat_pulldown));
        add(new WorkOutDetailsModel(0,"One Arm Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday2_one_arm_row));
        add(new WorkOutDetailsModel(0,"Reverse Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday3_reverse_grip_pull_down));
        add(new WorkOutDetailsModel(0,"Barbel Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday4_barbell_row));
        add(new WorkOutDetailsModel(0,"Close Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday5_close_grip_pulldown));
        add(new WorkOutDetailsModel(0,"Rack Pull","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday6_rack_pull));
    }};

    public static ArrayList<WorkOutDetailsModel> wednesdayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Dumbel Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday_1_dumbell_curl));
        add(new WorkOutDetailsModel(0,"Pre Archer Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday2_preacher_curl));
        add(new WorkOutDetailsModel(0,"One Arm Bicep Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday3_one_arm_bicep_curl));
        add(new WorkOutDetailsModel(0,"One Arm Concentration Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday4_one_arm_concentration_curl));
        add(new WorkOutDetailsModel(0,"Barbel Curl Wide Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday5_barbell_curl_wide_grip));
        add(new WorkOutDetailsModel(0,"Barbel Curl Close Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday6_barbel_curl_close_grip));
        add(new WorkOutDetailsModel(0,"Plate Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","25","2",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday7_plate_curl));
    }};

    public static ArrayList<WorkOutDetailsModel> thursdayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Triceps Pushdown","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thurday_1_triceps_pushdown));
        add(new WorkOutDetailsModel(0,"Over Head Extension","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday2_over_head_extension));
        add(new WorkOutDetailsModel(0,"Skull Crusher","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday3_skullcrusher));
        add(new WorkOutDetailsModel(0,"Triceps Bench Press","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday4_tricep_bench_press));
        add(new WorkOutDetailsModel(0,"Triceps Push Down Reverse Grip","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday5_tricep_push_down_reverse_grip));
        add(new WorkOutDetailsModel(0,"Triceps Kickbacks","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday6_tricep_kickbacks));
        add(new WorkOutDetailsModel(0,"Diamond Pushups","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","10","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday7_diamond_push_ups));
    }};

    public static ArrayList<WorkOutDetailsModel> fridayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Arnold Dumbell Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","15","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday_1_arnold_dumbbell_press));
        add(new WorkOutDetailsModel(0,"Barbel Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday2_barbel_press));
        add(new WorkOutDetailsModel(0,"Front Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday3_front_raise));
        add(new WorkOutDetailsModel(0,"Upright Row","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday4_upright_row));
        add(new WorkOutDetailsModel(0,"Side Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday5_side_raise));
        add(new WorkOutDetailsModel(0,"Face Pull","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday6_face_pull));
        add(new WorkOutDetailsModel(0,"Dumbel Shrug","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday7_dumbell_shrug));
        add(new WorkOutDetailsModel(0,"Bend Over Fly","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","25","3",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday8bend_over_fly));
    }};

    public static ArrayList<WorkOutDetailsModel> saturdayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Squat","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday_1_barbell_squat));
        add(new WorkOutDetailsModel(0,"Stationary Lunges Dumbel","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday2_stationary_lungs_dumbell));
        add(new WorkOutDetailsModel(0,"Dead Lifts","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday3_dead_lifts));
        add(new WorkOutDetailsModel(0,"Seated Extensions","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","12","4",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday4_seated_leg_extension));
        add(new WorkOutDetailsModel(0,"Seated Leg Curls","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday5_seated_leg_curl));
        add(new WorkOutDetailsModel(0,"Standing Calve Raise","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","6",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday6_standing_calve_raise));
    }};

    public static ArrayList<WorkOutDetailsModel> sundayWorkoutLooseWeight = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Curl Ups","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday_1_curl_ups));
        add(new WorkOutDetailsModel(0,"Reverse Crunches","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday2_reverse_crunches));
        add(new WorkOutDetailsModel(0,"Wipers","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday3_wipers));
        add(new WorkOutDetailsModel(0,"Leg Raises","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday4_leg_raise));
        add(new WorkOutDetailsModel(0,"V Sit Hold","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday5_v_sit_hold));
        add(new WorkOutDetailsModel(0,"Side Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday6_side_plank));
        add(new WorkOutDetailsModel(0,"Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday7_plank));
    }};

    //Maintain Fitness Work Out
    public static ArrayList<WorkOutDetailsModel> mondayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Bench Press","Lie back on a flat bench. " +
                "Using a medium width grip (a grip that creates a 90-degree angle in the middle of the " +
                "movement between the forearms and the upper arms), lift the bar from the rack and " +
                "hold it straight over you with your arms locked.","10","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday1_barbell_bench_press));
        add(new WorkOutDetailsModel(0,"Flat Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday2_flat_dumbell_fly));
        add(new WorkOutDetailsModel(0,"Incline Bench Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday3_incline_bench_press));
        add(new WorkOutDetailsModel(0,"Incline Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday4_incline_dumbbell_fly));
        add(new WorkOutDetailsModel(0,"Peck Deck Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","6","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday5_peck_deck_fly));
        add(new WorkOutDetailsModel(0,"Flat Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday6_flat_dumbell_press));
        add(new WorkOutDetailsModel(0,"Incline Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday7_incline_dumble_press));
        add(new WorkOutDetailsModel(0,"Dumbel Pullover","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","3","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday8_dumbell_pullover));
    }};

    public static ArrayList<WorkOutDetailsModel> tuesdayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Lat Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday_1_lat_pulldown));
        add(new WorkOutDetailsModel(0,"One Arm Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday2_one_arm_row));
        add(new WorkOutDetailsModel(0,"Reverse Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday3_reverse_grip_pull_down));
        add(new WorkOutDetailsModel(0,"Barbel Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday4_barbell_row));
        add(new WorkOutDetailsModel(0,"Close Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday5_close_grip_pulldown));
        add(new WorkOutDetailsModel(0,"Rack Pull","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday6_rack_pull));
    }};

    public static ArrayList<WorkOutDetailsModel> wednesdayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Dumbel Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday_1_dumbell_curl));
        add(new WorkOutDetailsModel(0,"Pre Archer Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday2_preacher_curl));
        add(new WorkOutDetailsModel(0,"One Arm Bicep Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday3_one_arm_bicep_curl));
        add(new WorkOutDetailsModel(0,"One Arm Concentration Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday4_one_arm_concentration_curl));
        add(new WorkOutDetailsModel(0,"Barbel Curl Wide Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday5_barbell_curl_wide_grip));
        add(new WorkOutDetailsModel(0,"Barbel Curl Close Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday6_barbel_curl_close_grip));
        add(new WorkOutDetailsModel(0,"Plate Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","25","2",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday7_plate_curl));
    }};

    public static ArrayList<WorkOutDetailsModel> thursdayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Triceps Pushdown","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thurday_1_triceps_pushdown));
        add(new WorkOutDetailsModel(0,"Over Head Extension","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday2_over_head_extension));
        add(new WorkOutDetailsModel(0,"Skull Crusher","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday3_skullcrusher));
        add(new WorkOutDetailsModel(0,"Triceps Bench Press","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday4_tricep_bench_press));
        add(new WorkOutDetailsModel(0,"Triceps Push Down Reverse Grip","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday5_tricep_push_down_reverse_grip));
        add(new WorkOutDetailsModel(0,"Triceps Kickbacks","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday6_tricep_kickbacks));
        add(new WorkOutDetailsModel(0,"Diamond Pushups","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","10","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday7_diamond_push_ups));
    }};

    public static ArrayList<WorkOutDetailsModel> fridayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Arnold Dumbell Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","15","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday_1_arnold_dumbbell_press));
        add(new WorkOutDetailsModel(0,"Barbel Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday2_barbel_press));
        add(new WorkOutDetailsModel(0,"Front Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday3_front_raise));
        add(new WorkOutDetailsModel(0,"Upright Row","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday4_upright_row));
        add(new WorkOutDetailsModel(0,"Side Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday5_side_raise));
        add(new WorkOutDetailsModel(0,"Face Pull","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday6_face_pull));
        add(new WorkOutDetailsModel(0,"Dumbel Shrug","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday7_dumbell_shrug));
        add(new WorkOutDetailsModel(0,"Bend Over Fly","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","25","3",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday8bend_over_fly));
    }};

    public static ArrayList<WorkOutDetailsModel> saturdayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Squat","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday_1_barbell_squat));
        add(new WorkOutDetailsModel(0,"Stationary Lunges Dumbel","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday2_stationary_lungs_dumbell));
        add(new WorkOutDetailsModel(0,"Dead Lifts","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday3_dead_lifts));
        add(new WorkOutDetailsModel(0,"Seated Extensions","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","12","4",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday4_seated_leg_extension));
        add(new WorkOutDetailsModel(0,"Seated Leg Curls","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday5_seated_leg_curl));
        add(new WorkOutDetailsModel(0,"Standing Calve Raise","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","6",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday6_standing_calve_raise));
    }};

    public static ArrayList<WorkOutDetailsModel> sundayWorkoutMaintainFitness = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Curl Ups","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday_1_curl_ups));
        add(new WorkOutDetailsModel(0,"Reverse Crunches","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday2_reverse_crunches));
        add(new WorkOutDetailsModel(0,"Wipers","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday3_wipers));
        add(new WorkOutDetailsModel(0,"Leg Raises","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday4_leg_raise));
        add(new WorkOutDetailsModel(0,"V Sit Hold","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday5_v_sit_hold));
        add(new WorkOutDetailsModel(0,"Side Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday6_side_plank));
        add(new WorkOutDetailsModel(0,"Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday7_plank));
    }};

    //Shreded Work Out
    public static ArrayList<WorkOutDetailsModel> mondayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Bench Press","Lie back on a flat bench. " +
                "Using a medium width grip (a grip that creates a 90-degree angle in the middle of the " +
                "movement between the forearms and the upper arms), lift the bar from the rack and " +
                "hold it straight over you with your arms locked.","10","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday1_barbell_bench_press));
        add(new WorkOutDetailsModel(0,"Flat Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday2_flat_dumbell_fly));
        add(new WorkOutDetailsModel(0,"Incline Bench Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday3_incline_bench_press));
        add(new WorkOutDetailsModel(0,"Incline Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday4_incline_dumbbell_fly));
        add(new WorkOutDetailsModel(0,"Peck Deck Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","6","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday5_peck_deck_fly));
        add(new WorkOutDetailsModel(0,"Flat Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday6_flat_dumbell_press));
        add(new WorkOutDetailsModel(0,"Incline Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday7_incline_dumble_press));
        add(new WorkOutDetailsModel(0,"Dumbel Pullover","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","3","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday8_dumbell_pullover));
    }};

    public static ArrayList<WorkOutDetailsModel> tuesdayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Lat Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday_1_lat_pulldown));
        add(new WorkOutDetailsModel(0,"One Arm Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday2_one_arm_row));
        add(new WorkOutDetailsModel(0,"Reverse Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday3_reverse_grip_pull_down));
        add(new WorkOutDetailsModel(0,"Barbel Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday4_barbell_row));
        add(new WorkOutDetailsModel(0,"Close Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday5_close_grip_pulldown));
        add(new WorkOutDetailsModel(0,"Rack Pull","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday6_rack_pull));
    }};

    public static ArrayList<WorkOutDetailsModel> wednesdayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Dumbel Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday_1_dumbell_curl));
        add(new WorkOutDetailsModel(0,"Pre Archer Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday2_preacher_curl));
        add(new WorkOutDetailsModel(0,"One Arm Bicep Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday3_one_arm_bicep_curl));
        add(new WorkOutDetailsModel(0,"One Arm Concentration Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday4_one_arm_concentration_curl));
        add(new WorkOutDetailsModel(0,"Barbel Curl Wide Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday5_barbell_curl_wide_grip));
        add(new WorkOutDetailsModel(0,"Barbel Curl Close Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday6_barbel_curl_close_grip));
        add(new WorkOutDetailsModel(0,"Plate Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","25","2",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday7_plate_curl));
    }};

    public static ArrayList<WorkOutDetailsModel> thursdayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Triceps Pushdown","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thurday_1_triceps_pushdown));
        add(new WorkOutDetailsModel(0,"Over Head Extension","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday2_over_head_extension));
        add(new WorkOutDetailsModel(0,"Skull Crusher","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday3_skullcrusher));
        add(new WorkOutDetailsModel(0,"Triceps Bench Press","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday4_tricep_bench_press));
        add(new WorkOutDetailsModel(0,"Triceps Push Down Reverse Grip","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday5_tricep_push_down_reverse_grip));
        add(new WorkOutDetailsModel(0,"Triceps Kickbacks","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday6_tricep_kickbacks));
        add(new WorkOutDetailsModel(0,"Diamond Pushups","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","10","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday7_diamond_push_ups));
    }};

    public static ArrayList<WorkOutDetailsModel> fridayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Arnold Dumbell Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","15","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday_1_arnold_dumbbell_press));
        add(new WorkOutDetailsModel(0,"Barbel Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday2_barbel_press));
        add(new WorkOutDetailsModel(0,"Front Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday3_front_raise));
        add(new WorkOutDetailsModel(0,"Upright Row","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday4_upright_row));
        add(new WorkOutDetailsModel(0,"Side Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday5_side_raise));
        add(new WorkOutDetailsModel(0,"Face Pull","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday6_face_pull));
        add(new WorkOutDetailsModel(0,"Dumbel Shrug","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday7_dumbell_shrug));
        add(new WorkOutDetailsModel(0,"Bend Over Fly","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","25","3",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday8bend_over_fly));
    }};

    public static ArrayList<WorkOutDetailsModel> saturdayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Squat","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday_1_barbell_squat));
        add(new WorkOutDetailsModel(0,"Stationary Lunges Dumbel","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday2_stationary_lungs_dumbell));
        add(new WorkOutDetailsModel(0,"Dead Lifts","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday3_dead_lifts));
        add(new WorkOutDetailsModel(0,"Seated Extensions","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","12","4",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday4_seated_leg_extension));
        add(new WorkOutDetailsModel(0,"Seated Leg Curls","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday5_seated_leg_curl));
        add(new WorkOutDetailsModel(0,"Standing Calve Raise","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","6",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday6_standing_calve_raise));
    }};

    public static ArrayList<WorkOutDetailsModel> sundayWorkoutShreded = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Curl Ups","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday_1_curl_ups));
        add(new WorkOutDetailsModel(0,"Reverse Crunches","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday2_reverse_crunches));
        add(new WorkOutDetailsModel(0,"Wipers","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday3_wipers));
        add(new WorkOutDetailsModel(0,"Leg Raises","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday4_leg_raise));
        add(new WorkOutDetailsModel(0,"V Sit Hold","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday5_v_sit_hold));
        add(new WorkOutDetailsModel(0,"Side Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday6_side_plank));
        add(new WorkOutDetailsModel(0,"Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday7_plank));
    }};

    //Strengthen Work Out
    public static ArrayList<WorkOutDetailsModel> mondayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Bench Press","Lie back on a flat bench. " +
                "Using a medium width grip (a grip that creates a 90-degree angle in the middle of the " +
                "movement between the forearms and the upper arms), lift the bar from the rack and " +
                "hold it straight over you with your arms locked.","10","4",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday1_barbell_bench_press));
        add(new WorkOutDetailsModel(0,"Flat Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday2_flat_dumbell_fly));
        add(new WorkOutDetailsModel(0,"Incline Bench Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday3_incline_bench_press));
        add(new WorkOutDetailsModel(0,"Incline Dumbel Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday4_incline_dumbbell_fly));
        add(new WorkOutDetailsModel(0,"Peck Deck Fly","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","6","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday5_peck_deck_fly));
        add(new WorkOutDetailsModel(0,"Flat Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday6_flat_dumbell_press));
        add(new WorkOutDetailsModel(0,"Incline Dumbel Press","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","10","4","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday7_incline_dumble_press));
        add(new WorkOutDetailsModel(0,"Dumbel Pullover","Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. ... Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other.","12","3","https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.monday8_dumbell_pullover));
    }};

    public static ArrayList<WorkOutDetailsModel> tuesdayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Lat Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday_1_lat_pulldown));
        add(new WorkOutDetailsModel(0,"One Arm Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday2_one_arm_row));
        add(new WorkOutDetailsModel(0,"Reverse Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday3_reverse_grip_pull_down));
        add(new WorkOutDetailsModel(0,"Barbel Row","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday4_barbell_row));
        add(new WorkOutDetailsModel(0,"Close Grip Pull Down","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","12","3",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday5_close_grip_pulldown));
        add(new WorkOutDetailsModel(0,"Rack Pull","The lat pulldown is a basic " +
                "upper body strength exercise that targets the upper back. The exercise also improves" +
                " stability in the lower back and core. Sit at a lat pulldown station and grab the bar " +
                "with an overhand grip that's just beyond shoulder width. Your arms should be " +
                "completely straight and your torso upright.","10","6",
                "https://www.youtube.com/watch?v=6oc4e1mxY7I",false,R.drawable.tuesday6_rack_pull));
    }};

    public static ArrayList<WorkOutDetailsModel> wednesdayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Dumbel Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday_1_dumbell_curl));
        add(new WorkOutDetailsModel(0,"Pre Archer Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday2_preacher_curl));
        add(new WorkOutDetailsModel(0,"One Arm Bicep Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","15","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday3_one_arm_bicep_curl));
        add(new WorkOutDetailsModel(0,"One Arm Concentration Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","12","4",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday4_one_arm_concentration_curl));
        add(new WorkOutDetailsModel(0,"Barbel Curl Wide Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday5_barbell_curl_wide_grip));
        add(new WorkOutDetailsModel(0,"Barbel Curl Close Grip","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","10","3",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday6_barbel_curl_close_grip));
        add(new WorkOutDetailsModel(0,"Plate Curl","Stand up straight with a dumbbell" +
                " in each hand at arm's length. Keep your elbows close to your torso and rotate the " +
                "palms of your hands until they are facing forward. This will be your starting " +
                "position. Now, keeping the upper arms stationary, exhale and curl the weights while" +
                " contracting your biceps.","25","2",
                "https://www.youtube.com/watch?v=_YTjy-Gy-hA",false,R.drawable.wednesday7_plate_curl));
    }};

    public static ArrayList<WorkOutDetailsModel> thursdayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Triceps Pushdown","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thurday_1_triceps_pushdown));
        add(new WorkOutDetailsModel(0,"Over Head Extension","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday2_over_head_extension));
        add(new WorkOutDetailsModel(0,"Skull Crusher","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday3_skullcrusher));
        add(new WorkOutDetailsModel(0,"Triceps Bench Press","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","12","4",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday4_tricep_bench_press));
        add(new WorkOutDetailsModel(0,"Triceps Push Down Reverse Grip","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday5_tricep_push_down_reverse_grip));
        add(new WorkOutDetailsModel(0,"Triceps Kickbacks","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","20","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday6_tricep_kickbacks));
        add(new WorkOutDetailsModel(0,"Diamond Pushups","Triceps Pushdown Instructions." +
                " Attach a straight or angled bar to a high pulley and grab with an overhand grip " +
                "(palms facing down) at shoulder width. Standing upright with the torso straight and" +
                " a very small inclination forward, bring the upper arms close to your body and " +
                "perpendicular to the floor.","10","3",
                "https://www.youtube.com/watch?v=6QfFhexaTsw",false,R.drawable.thursday7_diamond_push_ups));
    }};

    public static ArrayList<WorkOutDetailsModel> fridayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Arnold Dumbell Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","15","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday_1_arnold_dumbbell_press));
        add(new WorkOutDetailsModel(0,"Barbel Press","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday2_barbel_press));
        add(new WorkOutDetailsModel(0,"Front Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday3_front_raise));
        add(new WorkOutDetailsModel(0,"Upright Row","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday4_upright_row));
        add(new WorkOutDetailsModel(0,"Side Raise","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","12","4",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday5_side_raise));
        add(new WorkOutDetailsModel(0,"Face Pull","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday6_face_pull));
        add(new WorkOutDetailsModel(0,"Dumbel Shrug","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","20","6",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday7_dumbell_shrug));
        add(new WorkOutDetailsModel(0,"Bend Over Fly","Arnold Dumbbell Press " +
                "Instructions. Sit on an exercise bench with back support and hold two dumbbells in " +
                "front of you at about upper chest level with your palms facing your body and your " +
                "elbows bent. ... Now to perform the movement, raise the dumbbells as you rotate the" +
                " palms of your hands until they are facing forward.","25","3",
                "https://www.youtube.com/watch?v=b0IHryoFzg4",false,R.drawable.friday8bend_over_fly));
    }};

    public static ArrayList<WorkOutDetailsModel> saturdayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Barbel Squat","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday_1_barbell_squat));
        add(new WorkOutDetailsModel(0,"Stationary Lunges Dumbel","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday2_stationary_lungs_dumbell));
        add(new WorkOutDetailsModel(0,"Dead Lifts","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","8","8",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday3_dead_lifts));
        add(new WorkOutDetailsModel(0,"Seated Extensions","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","12","4",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday4_seated_leg_extension));
        add(new WorkOutDetailsModel(0,"Seated Leg Curls","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","2",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday5_seated_leg_curl));
        add(new WorkOutDetailsModel(0,"Standing Calve Raise","Back squat – the bar is held on " +
                "the back of the body upon the upper trapezius muscle, near to the base of the neck." +
                " ... Sumo squat – the barbell is rested on the shoulders in the usual squat position." +
                " The legs should be slightly wider than shoulder width apart and the feet should be" +
                " pointed outwards.","25","6",
                "https://www.youtube.com/watch?v=dGCPGYaN5xs",false,R.drawable.saturday6_standing_calve_raise));
    }};

    public static ArrayList<WorkOutDetailsModel> sundayWorkoutStrengthen = new ArrayList<WorkOutDetailsModel>(){{
        add(new WorkOutDetailsModel(0,"Curl Ups","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday_1_curl_ups));
        add(new WorkOutDetailsModel(0,"Reverse Crunches","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday2_reverse_crunches));
        add(new WorkOutDetailsModel(0,"Wipers","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday3_wipers));
        add(new WorkOutDetailsModel(0,"Leg Raises","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday4_leg_raise));
        add(new WorkOutDetailsModel(0,"V Sit Hold","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday5_v_sit_hold));
        add(new WorkOutDetailsModel(0,"Side Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday6_side_plank));
        add(new WorkOutDetailsModel(0,"Plank","Sit-ups or Curl-ups. Lie on your " +
                "back with your arms crossed over your chest, keeping your knees slightly bent. " +
                "Raise your upper body off the floor by flexing your abdominal muscles. " +
                "Touch your elbows to your thighs and repeat. During the PFT, someone will be " +
                "counting and holding your feet for you.","25","1",
                "https://www.youtube.com/watch?v=5DFAcAvT2mI",false,R.drawable.sunday7_plank));
    }};

    //Build Muscle Diet
    public static ArrayList<DietModel> buildMuscleBreakfastDiet = new ArrayList<DietModel>(){{
        add(new DietModel("3 Eggs Full",260));
        add(new DietModel("3 Eggs White",50));
        add(new DietModel("200gm Oats",320));
        add(new DietModel("1 Cup Milk",125));
        add(new DietModel("1 Banana",125));
    }};

    public static ArrayList<DietModel> buildMuscleSnack1Diet = new ArrayList<DietModel>(){{
        add(new DietModel("200gm Sweet Potato",190));
    }};

    public static ArrayList<DietModel> buildMuscleSnack2Diet = new ArrayList<DietModel>(){{
        add(new DietModel("1 Scoop Protein Water",130));
        add(new DietModel("20 Almonds",120));
    }};

    public static ArrayList<DietModel> buildMuscleLunchDiet = new ArrayList<DietModel>(){{
        add(new DietModel("3 Eggs Full",260));
        add(new DietModel("3 Eggs White",50));
        add(new DietModel("200gm Oats",320));
        add(new DietModel("1 Cup Milk",125));
        add(new DietModel("1 Banana",125));
    }};

    public static ArrayList<DietModel> buildMuscleSnack3Diet = new ArrayList<DietModel>(){{
        add(new DietModel("200gm Sweet Potato",190));
    }};

    public static ArrayList<DietModel> buildMuscleSnack4Diet = new ArrayList<DietModel>(){{
        add(new DietModel("1 Scoop Protein Water",130));
        add(new DietModel("20 Almonds",120));
    }};

    public static ArrayList<DietModel> buildMuscleDinnerDiet = new ArrayList<DietModel>(){{
        add(new DietModel("3 Eggs Full",260));
        add(new DietModel("3 Eggs White",50));
        add(new DietModel("200gm Oats",320));
        add(new DietModel("1 Cup Milk",125));
        add(new DietModel("1 Banana",125));
    }};

    public static int getID(ArrayList<WorkOutStatusModel> array, int find){

        int category_id = -1;

        for (int i = 0 ; i < array.size() ; i++) {

            if (array.get(i).getWorkoutid() == find){

                Log.e("TEST","FIND: " + find);
                category_id = i;

                break;

            }

        }

        //Log.e("TAG","ID: " + category_id);

        return category_id;

    }



    public static int ifworkout_exists(ArrayList<WorkOutStatusModel> array, int find){

        int id = -1;

        for (int i = 0 ; i < array.size() ; i++) {

            if (array.get(i).getWorkoutid() == find){

                id = i;

                break;

            }

        }

        //Log.e("TAG","ID: " + category_id);

        return id;

    }

    public static String getDay(){

        String din = "";

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                // Current day is Sunday
                din="sunday";
                break;
            case Calendar.MONDAY:
                // Current day is Monday
                break;
            case Calendar.TUESDAY:
                // etc.
                break;
            case Calendar.WEDNESDAY:
                // etc.
                break;
            case Calendar.THURSDAY:
                // etc.
                break;
            case Calendar.FRIDAY:
                // etc.
                break;
            case Calendar.SATURDAY:
                // etc.
                break;
        }

        return din;
    }

    /*public static ArrayList<WorkOutDetail> getList(Context context){

        if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Build Muscle")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutBuildMuscle;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutBuildMuscle;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutBuildMuscle;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutBuildMuscle;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutBuildMuscle;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutBuildMuscle;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutBuildMuscle;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Maintain Fitness")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutMaintainFitness;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutMaintainFitness;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutMaintainFitness;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutMaintainFitness;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutMaintainFitness;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutMaintainFitness;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutMaintainFitness;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Loose Weight")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutLooseWeight;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutLooseWeight;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutLooseWeight;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutLooseWeight;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutLooseWeight;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutLooseWeight;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutLooseWeight;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Gain Strength")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutStrengthen;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutStrengthen;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutStrengthen;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutStrengthen;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutStrengthen;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutStrengthen;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutStrengthen;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Shredded")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutShreded;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutShreded;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutShreded;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutShreded;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutShreded;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutShreded;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutShreded;

            }

        } else {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutBuildMuscle;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutBuildMuscle;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutBuildMuscle;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutBuildMuscle;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutBuildMuscle;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutBuildMuscle;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutBuildMuscle;

            }

        }

        return arraylist;
    }*/

}