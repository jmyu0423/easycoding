package com.easycoding.myjava.common.exception;

import com.easycoding.myjava.common.support.ServiceResourceBundleMessage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("Serializable")
public class ServiceException extends RuntimeException{
    @Autowired
    protected ServiceResourceBundleMessage serviceResourceBundleMessage;

    /**
     * 에로 코드 기본값은 1000 이며 서비스 단의 에러 코드는 1000 단위에서 처리
     */
    private int code = 1000;
    /**
     * 에러 메시지
     */
    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    public ServiceException() {
        setData("class", this.getClass().toString());
    }

    public ServiceException(String message) {
        setData("class", this.getClass().toString());
        setMessage(message);
    }

    public ServiceException(String message, Object[] args) {
        setData("class", this.getClass().toString());
        setMessage(message, args);
    }

    public ServiceException(int code, String message) {
        setCode(code);
        setMessage(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        setData("class", this.getClass().toString());
        setMessage(message, null);
    }

    public void setMessage(String message, Object[] args) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    /**
     * 오류 추가 정보
     * <p>
     * JSON으로 변환시 클라이언트에 함께 전달 됨.
     *
     * @param key
     * @param value
     */
    public void setData(String key, Object value) {
        data.put(key, value);
    }

    public Map<String, Object> getData() {
        return this.data;
    }
}
