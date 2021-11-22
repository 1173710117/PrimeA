package com.hitices.primea.controller;

import com.hitices.common.bean.MResponse;
import com.hitices.mclient.annotation.MFuncProcess;
import com.hitices.mclient.base.Action;
import com.hitices.mclient.base.MObject;
import com.hitices.mclient.core.MServiceSkeleton;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController extends MObject {
    @MFuncProcess(value = {"PrimeService.prime1"})
    @PostMapping(value = "/primea")
    public MResponse isPrimea(Action action, @RequestParam Integer n){
//        if (primeService.prime1(n)){
//            return primeService.prime2(n);
//        }
//        return false;
        return MServiceSkeleton.getInstance().runProcess(action,n);
    }
}