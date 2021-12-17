//
// Created by maiph on 11/19/2021.
//
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_testmap_cmake_Keys_apiKey(JNIEnv *env, jobject thiz) {
    std::string api_key = "AIzaSyBd7HxsYnAtzWym3wWKm4tlWu3q-D7QFdo";
    return env->NewStringUTF(api_key.c_str());
}