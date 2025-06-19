package dao;

import model.ChiTietHoaDon;
import java.sql.*;

public class ChiTietHoaDonDAO {

    public void themChiTiet(ChiTietHoaDon ct) throws Exception {
        String sql = "INSERT INTO ChiTietHoaDon (idHoaDon, tenDichVu, gia) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, ct.getIdHoaDon());
            stmt.setString(2, ct.getTenDichVu());
            stmt.setDouble(3, ct.getGia());
            stmt.executeUpdate();
        }
    }
}
