package com.github.cotrod.spring;

import com.github.cotrod.spring.conf.ForSimpleMusicPlayerConf;
import com.github.cotrod.spring.model.MusicPlayer;
import com.github.cotrod.spring.model.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

class SpringTest {
    //  Task 1
    @Test
    void contextBeanWithXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("for_simp_mus_player_xml.xml");
        MusicPlayer musPlayer = context.getBean(SimpleMusicPlayerXml.class);
        musPlayer.playMusic();
        context.close();
    }

    // Task 2
    @Test
    void contextBeanJavaConf() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ForSimpleMusicPlayerConf.class);
        MusicPlayer musPlayer = context.getBean(SimpleMusicPlayerJavaConf.class);
        musPlayer.playMusic();
        context.close();
    }

    // Task 3
    @Test
    void contextBeanAnnotation() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musPlayer = context.getBean(SimpleMusicPlayerAnnotation.class);
        musPlayer.playMusic();
        context.close();
    }

    // Task 4
    @Test
    void injectionWithField() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musicPlayer = context.getBean(MusicPlayerWthBeanField.class);
        musicPlayer.playMusic();
        context.close();
    }

    // Task 5
    @Test
    void injectionWithSetter() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musicPlayer = context.getBean(MusicPlayerWthBeanSetter.class);
        musicPlayer.playMusic();
        context.close();
    }

    // Task 6
    @Test
    void injectionWithConstructor() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musicPlayer = context.getBean(MusicPlayerWthBeanConstructor.class);
        musicPlayer.playMusic();
        context.close();
    }

    // Task 7
    @Test
    void injectionTwoBeansName() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musicPlayer = context.getBean(MusicPlayerWthTwoBeans.class);
        musicPlayer.playMusic();
        context.close();
    }

    // Task 8
    @Test
    void injectionListOfBeans() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musicPlayer = context.getBean(MusicPlayerWthListOfBeans.class);
        musicPlayer.playMusic();
        context.close();
    }

    // Task 9
    @Test
    void injectionValueFromPropFile() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.cotrod.spring.model");
        context.refresh();
        MusicPlayer musicPlayer = context.getBean(MusicPlayerWthPropertiesFile.class);
        musicPlayer.playMusic();
        context.close();
    }

    // Task 10
    @Test
    void measuringInitializationTime() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.cotrod.spring.model");
        MusicPlayer musicPlayer = context.getBean("musicPlayerAnnotatedMethod", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
//  Aspects
    @Test
    void measuringInitializationTime2() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.cotrod.spring.model");
        MyExperimentalClass myClass = context.getBean(MyExperimentalClass.class);
        myClass.doSmth();
        myClass.doSmt3();
        myClass.doSomth2();
        context.close();
    }

}
