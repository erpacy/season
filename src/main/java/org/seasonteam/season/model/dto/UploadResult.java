package org.seasonteam.season.model.dto;

import java.io.Serializable;

/**
 * 上传图片结果
 *
 * @author yust
 *         2016-11-24
 */
public class UploadResult extends ResultHeader implements Serializable {

    private UploadResultData data;

    public UploadResultData getData() {
        return data;
    }

    public void setData(UploadResultData data) {
        this.data = data;
    }

    public static class UploadResultData implements Serializable {
        private String fileUrl;

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }
    }
}
