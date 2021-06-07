package Controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/uploadFile")
public class UploadFileController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFileController() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        // xử lý upload file khi người dùng nhấn nút thực hiện
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            for (FileItem fileItem : fileItems) {
                if (!fileItem.isFormField()) {
                    // xử lý file
                    String nameimg = fileItem.getName();
                    if (!nameimg.equals("")) {
                        String dirUrl = request.getServletContext()
                                .getRealPath("") + File.separator + "files";
                        File dir = new File(dirUrl);
                        if (!dir.exists()) {
                            dir.mkdir();
                        }
                        String fileImg = dirUrl + File.separator + nameimg;
                        File file = new File(fileImg);
                        try {
                            fileItem.write(file);
                            System.out.println("UPLOAD THÀNH CÔNG...!");
                            System.out.println("ĐƯỜNG DẪN KIỂM TRA UPLOAD HÌNH ẢNH : \n"+dirUrl);
                        } catch (Exception e) {
                            System.out.println("CÓ LỖI TRONG QUÁ TRÌNH UPLOAD!");
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
