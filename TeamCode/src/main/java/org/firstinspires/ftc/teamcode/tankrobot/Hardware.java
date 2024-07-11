package org.firstinspires.ftc.teamcode.tankrobot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware {
    public static Hardware instance = null;
    private HardwareMap hmap;

    public DcMotor leftMotor;
    public DcMotor rightMotor;

    public Hardware(Hardware hmap){
    }


    public Hardware(){

    }
    public Hardware getInstance(){
        if(instance == null) {

            instance = new Hardware();
        }
        return instance;
        }

        public void init(HardwareMap hmap){
            this.hmap = hmap;

            leftMotor = hmap.get(DcMotor.class, "leftMotor");
            rightMotor = hmap.get(DcMotor.class, "rightMotor");
        }

        public void loop() {

        }
}

