/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.step;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StepDAO {

    private static final String GET_STEPS_BY_RECIPEID = "SELECT * FROM [Step] WHERE recipeID = ?";

    public List<StepDTO> getStepsByRecipeID(int recipeID) throws SQLException {
        List<StepDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection1();
            ptm = conn.prepareStatement(GET_STEPS_BY_RECIPEID);
            ptm.setInt(1, recipeID);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int stepID = rs.getInt("stepID");
                int stepNumber = rs.getInt("stepNumber");
                String instructions = rs.getString("instructions");
                list.add(new StepDTO(stepID, recipeID, stepNumber, instructions));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
}
