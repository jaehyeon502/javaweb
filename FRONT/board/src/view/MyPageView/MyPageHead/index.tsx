import React from "react";

import { Box, Typography, IconButton, Avatar } from "@mui/material";
import EditOutlinedIcon from "@mui/icons-material/EditOutlined";
import { useUserStore } from "src/stores";

export default function MyPageHead() {

    const { user } = useUserStore();

  return (
    <Box sx={{ p: "40px 120px", display: "flex" }}>
      <Box>
        <IconButton>
          <Avatar sx={{ height: "120px", width: "120px" }} alt={user?.nickname} src={user?.profile} />
        </IconButton>
      </Box>
      <Box>
        <Box>
          <Typography>{user?.nickname}</Typography>
          <IconButton>
            <EditOutlinedIcon />
          </IconButton>
        </Box>
        <Typography>{user?.email}</Typography>
      </Box>
    </Box>
  );
}
